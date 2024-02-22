/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Bravo
 */
public class HandlesRes {
    private DataAccess choice = DataAccess.instance();

   
    public void findPersonInfo() {
        choice.findPersonInfo();
    }

    public void copyNewFile() {
        choice.copyNewFile();
    }
    
}
