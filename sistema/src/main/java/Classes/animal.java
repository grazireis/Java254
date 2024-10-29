/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public abstract class animal {
   protected String nome;
   
   public animal (String nome){
       this.nome = nome;
   }
   
   public abstract void emitirSom();
}
