package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.dto.ItemFileSavingLevelDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemFileMapper {

    public List<ItemDTO> selectAll();


    public List<ItemFileSavingLevelDTO> selectitemfile();
}
