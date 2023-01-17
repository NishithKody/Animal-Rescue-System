/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sampledb40;

/**
 *
 * @author adity
 */

public class Pilot {
 private String name;
 private int points;

 public Pilot(String name,int points) {
 this.name=name;
 this.points=points;
 }

 public int getPoints() {
 return points;
 }

 public void addPoints(int points) {
 this.points+=points;
 }

 public String getName() {
 return name;
 }

 public String toString() {
 return name+"/"+points;
 }
}