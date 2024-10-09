package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EmpleadoController {

    @Autowired
    private Empleado;



    //metodo
    @GetMapping("/empleados/nuevoEmpleado")
    public String formEmpleado(ModelMap){
        List<Rol> roles = rolserviceImplements.listaRoles();
        model.addAttribute("empleados", new Empleado());
        System.out.println("Esto es de Roles: " + roles);
        model.addAttribute("roles", roles);
        return "nuevoEmpleado";
    }
}
