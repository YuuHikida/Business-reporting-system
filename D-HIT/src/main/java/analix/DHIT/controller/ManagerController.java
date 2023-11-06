package analix.DHIT.controller;

import analix.DHIT.mapper.UserMapper;
import analix.DHIT.model.User;
import analix.DHIT.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/manager")
public class ManagerController {


    private final UserService userService;

    public ManagerController(UserService userservice)
    {
        this.userService=userservice;
    }
    @GetMapping("/manager/report-search")
    public String displayReportSearch(@RequestParam(name = "employeeCode", required = true) int employeeCode, Model model) {
        User user=userService.getUserByEmployeeCode(employeeCode);

        model.addAttribute("memberName",user.getName());
        model.addAttribute("employeeCode",user.getEmployeeCode());

        return "manager/report-search";
    }

}
