//package com.sx.createxml.pojo.postgre;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
///**
// * @author sunxu93@163.com
// * @date 19/10/20/020 17:28
// */
//@Entity
//@Table(name = "book")
//public class Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private  String name;
//
//    private   Long  sn;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Long getSn() {
//        return sn;
//    }
//
//    public void setSn(Long sn) {
//        this.sn = sn;
//    }
//
//    //
////    @NotBlank
////    @Size(min = 1, max = 50)
////    private String type;
////
////    @NotBlank
////    @Size(min = 3, max = 100)
////    private String title;
////
////    @Column(columnDefinition = "text")
////    private String description;
////
////    @Column(name = "fav_count")
////    private int favCount;
//
//
//    public Book() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//}