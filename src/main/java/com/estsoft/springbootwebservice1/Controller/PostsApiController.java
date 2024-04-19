package com.estsoft.springbootwebservice1.Controller;

import com.estsoft.springbootwebservice1.dto.PostsResponseDto;
import com.estsoft.springbootwebservice1.dto.PostsSaveRequestDto;
import com.estsoft.springbootwebservice1.dto.PostsUpdateRequestDto;
import com.estsoft.springbootwebservice1.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id,requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id){
        postsService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable long id){
        return postsService.findById(id);
    }
}
