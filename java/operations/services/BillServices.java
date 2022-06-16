/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder.services;

import folder.LowBalanceException;
import folder.models.Response;
import java.util.Date;


/**
 *
 * @author Hp
 */
public class BillServices implements Client{
    
    public boolean status=true;
    @Override // Client implement edildiği için onun metotlarını oveerride etmemiz gerekir . Override işlemi yapıldı . 
    public  Response payment(int billType, String memberCode,double balance, double amount) throws LowBalanceException{

        if(balance<amount){// oluşturduğumuz LowBalanceException sınıfından hata mesajı atıyor . 
            throw new LowBalanceException("Yetersiz bakiye ");
        }
        else{
            return new Response("0","2022-10-10");// Eğer hata yok ise Response geri dönüş atıyor . 
        }
    }

    @Override
    public Response inquire(int billType, String memberCode) {
        if(status){
            return new Response("0","2022-10-10");

        }else {
            return new Response("1","2022-10-10");

        }
    }

    @Override
    public Response inquire(int billType, String memberCode, double amount, Date billDate) {
        if(status){
            return new Response("0","2022-10-10");

        }else {
            return new Response("1","2022-10-10");

        }
    }

    @Override
    public Response cancelPayment(int billType, String memberCode, double amount,int paymentId,Date billDate) {

            return new Response("0","2022-10-10");
    }
}
