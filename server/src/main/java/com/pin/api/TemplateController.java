package com.pin.api;

import com.pin.service.CacheService;
import com.pin.domain.request.SaveTemplateIdRequest;
import com.pin.infrastructure.cache.TemplateCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Parmaze
 * @date 2021/12/16
 */
@RestController
@RequestMapping("template")
public class TemplateController {
    @Autowired
    private CacheService cacheService;
    @Autowired
    private TemplateCache templateCache;

    @PostMapping("save")
    public void save(@RequestBody SaveTemplateIdRequest request) {
        Integer userId = cacheService.getUserId(request.getToken());
        templateCache.setId(userId, request.getTemplateId());
    }
}
