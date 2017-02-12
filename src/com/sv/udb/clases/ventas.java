/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardo
 */
public class ventas {
     
    public List<Tanques> getDataTanques()
    {
        List<Tanques> resp = null;
        try
        {
            String csvFile = "com/sv/udb/files/tanques.csv";
            File file = new File(ClassLoader.getSystemResource(csvFile).getFile());
            String line = "";
            String simb = ",";
            if(file.exists())
            {
                resp = new ArrayList<>();
                BufferedReader br = new BufferedReader(new FileReader(file));
                while ((line = br.readLine()) != null)
                {
                    String[] campos = line.split(simb);
                    resp.add(new Tanques(campos[0], campos[1], campos[2], campos[3]));
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    return resp;
    }
    
    public void ActualizarTanques(List<Tanques> Nuevo){
        
        String outputFile = "src\\com\\sv\\udb\\files\\tanques.csv";
        boolean alreadyExists = new File(outputFile).exists();
         
        if(alreadyExists){
            File ArchivoEmpleados = new File(outputFile);
            ArchivoEmpleados.delete();
        }
        
        try {  
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            for(Tanques temp : Nuevo){
                 
                csvOutput.write(temp.getTipo());
                csvOutput.write(temp.getPrecio());
                csvOutput.write(temp.getMaximo());
                csvOutput.write(temp.getActual());
                csvOutput.endRecord();                   
            }
            
            csvOutput.close();
         
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
    
    public List<Registro> getDataRegistros()
    {
        List<Registro> resp = null;
        try
        {
            String csvFile = "com/sv/udb/files/ventas.csv";
            File file = new File(ClassLoader.getSystemResource(csvFile).getFile());
            String line = "";
            String simb = ",";
            if(file.exists())
            {
                resp = new ArrayList<>();
                BufferedReader br = new BufferedReader(new FileReader(file));
                while ((line = br.readLine()) != null)
                {
                    String[] campos = line.split(simb);
                    resp.add(new Registro(campos[0], campos[1], campos[2], campos[3], campos[4]));
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    return resp;
    }
    
    public void ActualizarRegistro(List<Registro> Nuevo){
        
        String outputFile = "src\\com\\sv\\udb\\files\\ventas.csv";
        boolean alreadyExists = new File(outputFile).exists();
         
        if(alreadyExists){
            File ArchivoEmpleados = new File(outputFile);
            ArchivoEmpleados.delete();
        }
        
        try {  
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            for(Registro temp : Nuevo){
                 
                csvOutput.write(temp.getCliente());
                csvOutput.write(temp.getCantidad());
                csvOutput.write(temp.getPagado());
                csvOutput.write(temp.getTipo());
                csvOutput.write(temp.getFecha());
                csvOutput.endRecord();                   
            }
            
            csvOutput.close();
         
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
    
}
