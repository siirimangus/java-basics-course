package com.bcs.todolist.role;

import com.bcs.todolist.common.FileProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RoleService {
    private final static String DATA_FILE_NAME = "role.json";
    private FileProcessor fileProcessor;

    @Autowired
    public RoleService(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    public List<Role> getAllRoles() {
        return fileProcessor.readAsList(RoleService.DATA_FILE_NAME, Role[].class);
    }

    public Role getRoleById(Integer id) {
        List<Role> roles = getAllRoles();

        for (Role role : roles) {
            if (role.getId().equals(id)) {
                return role;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public void saveRole(Role role) {
        List<Role> roles = getAllRoles();

        roles.add(role);

        fileProcessor.update(RoleService.DATA_FILE_NAME, roles);
    }

    public void deleteRole(Integer id) {
        List<Role> roles = getAllRoles();

        for (Role role : roles) {
            if (role.getId().equals(id)) {
                roles.remove(role);
                break;
            }
        }

        fileProcessor.update(RoleService.DATA_FILE_NAME, roles);
    }
}
