


import folder.LowBalanceException;
import folder.models.Response;
import folder.services.BillServices;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author Hp
 */
public class Mainweek2 {

    public static void main(String[] args) throws LowBalanceException {
       
     
        try{
               BillServices billServices=new BillServices(); // Fatura işlemlerinin yer aldığı BillServisten nesne oluşruruldu.
        Response response=billServices.payment(0,"ev",7,10); //Response sınıfından nesne ataması işlemi yapıldı .
          if(response.getCode().equals("0")){// response bize bir değer döndürücek onu kontrol ediyoruz . 
            System.out.println("İşlem Başarısız. Oluşma tarihi :"+response.getDate());
        }else if(response.getCode().equals("1")){
            System.out.println("İşlem başarısız. Oluşma tarihi :"+response.getDate());
        }else {
            System.out.println("Hata var !! ");
        }  
        }catch(Exception e){
            System.out.println("Hata mesajı : "  + e.getLocalizedMessage());
        }
        
    }
}
