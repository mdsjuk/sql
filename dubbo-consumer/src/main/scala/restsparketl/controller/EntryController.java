package restsparketl.controller;

import com.dubbo.service.DP_noise;
import com.dubbo.service.RW;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@RestController
public class EntryController {

    @Reference
    private RW rw;
    @Reference
    private DP_noise dp_noise;


    @RequestMapping(value = "/Lp")
    @ResponseBody
    public String Laplace(){
        return dp_noise.noise();

    }
    @RequestMapping(value = "/R")
    @ResponseBody
    public String Rewriting(){
        return  rw.RW();

    }
}

