package com.sparta.hangheamemo.service;

import com.sparta.hangheamemo.dto.MemoRequestDto;
import com.sparta.hangheamemo.entity.Memo;
import com.sparta.hangheamemo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoRepository memoRepository;

    @Transactional
    public Memo createMemo(MemoRequestDto requestDto){
        Memo memo = new Memo(requestDto);
        memoRepository.save(memo);
        return
    }
}