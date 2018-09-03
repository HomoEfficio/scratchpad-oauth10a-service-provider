package io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.controller;

import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.Consumer;
import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.service.ConsumerService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author homo.efficio@gmail.com
 * Created on 2018-08-30.
 */
@Controller
@RequestMapping("/consumer")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ConsumerController {

    @NonNull
    private ConsumerService service;

    @GetMapping("/register")
    public ModelAndView registerForm(ModelAndView mav) {
        mav.setViewName("registerForm");
        return mav;
    }

    @PostMapping("/register")
    public ModelAndView register(Consumer consumer, ModelAndView mav) {
        mav.setViewName("registerResult");
        mav.addObject("consumer", this.service.save(consumer));
        return mav;
    }

    // TODO: Request Token(Temporary Credentials) End Point 만들 차례
}
