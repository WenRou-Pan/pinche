package com.pinche.api;

import com.pinche.domain.request.SaveTemplateIdRequest;
import com.pinche.infrastructure.cache.TemplateCache;
import com.pinche.service.CacheService;
import com.pinche.service.annotation.ParamCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用戶加入行程
 *
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
 */
@RestController
@RequestMapping("template")
public class TemplateController {
    @Autowired
    private CacheService cacheService;
    @Autowired
    private TemplateCache templateCache;

    @PostMapping("save")
    @ParamCheck()
    public void save(@RequestBody SaveTemplateIdRequest request) {
        Integer userId = cacheService.getUserId(request.getToken());
        templateCache.setId(userId, request.getTemplateId());
    }
}
