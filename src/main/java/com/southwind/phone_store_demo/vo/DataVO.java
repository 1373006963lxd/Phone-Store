package com.southwind.phone_store_demo.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DataVO {
    //根据文档需要返回给前端的形式  对象-list-对象，
    //超过两个创建对象，如果只有一个则用map即可
    /*{
        categories:[
        {

        }
                ],
        phones:[
    {

    }
                ]
    }*/
    private List<PhoneCategoryVO> categories;
    private List<PhoneInfoVO> phones;
}
