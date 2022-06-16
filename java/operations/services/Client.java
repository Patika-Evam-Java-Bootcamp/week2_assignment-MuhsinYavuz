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
public interface Client {
     Response payment(int billType, String memberCode,double balance, double amount) throws LowBalanceException; // throws ile LowBalanceException kullanılacağı belirtild.
     // Clientin işlevleri oluşturuldu. 
     Response inquire(int billType,String memberCode);
      Response inquire(int billType, String memberCode, double amount,Date billDate);
      // inpuire ile overloading yapıldı . 
      Response cancelPayment(int billType, String memberCode, double amount,int paymentId,Date billDate);
}
