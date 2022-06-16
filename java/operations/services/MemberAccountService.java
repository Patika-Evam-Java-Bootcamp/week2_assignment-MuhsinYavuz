package folder.services;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import folder.models.MemberAccount;


/**
 *
 * @author Hp
 */
public class MemberAccountService {
    //MemberAccountService için create , read , update , delete metotları oluşturuldu.
     public static void create(MemberAccount member){
        System.out.println("Üye bilgileri olusturuldu");
    }
    public static void read(){
        System.out.println("Üye bilgileri görüntülendi");
    }
     public static void update(MemberAccount member,MemberAccount newMember){
        System.out.println("Üye bilgileri güncellendi");
    }
      public static void delete(MemberAccount member){
        System.out.println("Üye  silindi");
    }
    
}
