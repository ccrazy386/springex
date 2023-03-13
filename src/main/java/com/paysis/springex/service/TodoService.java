package com.paysis.springex.service;

import com.paysis.springex.dto.PageRequestDTO;
import com.paysis.springex.dto.PageResponseDTO;
import com.paysis.springex.dto.TodoDTO;

public interface TodoService {

    void register(TodoDTO todoDTO);

    //List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);
}
