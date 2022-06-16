package folder;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Hp
 */
public class LowBalanceException extends Exception {
    String message; // hata mesağı dönecek  değişken değeri 

    public LowBalanceException(String message) { // Constructer String bir değer alarak başlatılacak . 
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }

}
