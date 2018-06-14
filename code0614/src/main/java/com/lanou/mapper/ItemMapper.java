package com.lanou.mapper;

import com.lanou.entity.Item;

import java.util.List;

public interface ItemMapper {

    List<Item> findItem(Item item);

    int deleteByIds(List<Integer> ids);

    int deleteByIdArray(Integer[] ids);


}
