/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author info5
 */
public class Conversora {
    double CelsiusToFahrenheit(double ctemp) {
        double ftemp;
        ftemp = (9 * ctemp) / 5 + 32;
        return ftemp;

    }
    
    
    double CelsiusToKelvin(double ctemp) {
        double ktemp;
        ktemp = ctemp + 273.15;
        return ktemp;
    }
    
    double FahrenheitToCelsius(double ftemp) {
        double ctemp;
        ctemp = (ftemp - 32) * 5 / 9;
        return ctemp;
    }
    
    double FahrenheitToKelvin(double ftemp) {
        double ktemp;
        ktemp = (ftemp - 32) * 5 / 9 + 273.15;
        return ktemp;
        
    }
    
    double KelvinToCelsius(double ktemp) {
        double ctemp;
        ctemp = ktemp - 273.15;
        return ctemp;
    }
    
    double KelvinToFahrenheit(double ktemp) {
        double ftemp;
        ftemp = (ktemp - 273.15) * 9 / 5 + 32;
        return ftemp;
    }
    
    double KelvinToKelvin(double ktemp) {
        ktemp = (ktemp);
        return ktemp;
    }
    
    double FahrenheitToFahrenheit(double ftemp) {
        ftemp = (ftemp);
        return ftemp;
    }
    
    double CelsiusToCelsius(double ctemp) {
        ctemp = (ctemp);
        return ctemp;
    }
    
}

