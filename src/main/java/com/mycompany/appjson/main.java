/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.appjson;




/**
 *
 * @author Developer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JSON_CRUD formPersonas = new JSON_CRUD();
        formPersonas.setVisible(true);
/*
         JSONObject persona1 = new JSONObject();
         persona1.put("nombre","Juan Lopez");
         persona1.put("telefono", 99991111);

         JSONObject persona2 = new JSONObject();
         persona2.put("nombre","Luis Gabriel");
         persona2.put("telefono", 85212569);



         JSONArray listPersonas = new JSONArray();
         listPersonas.add(persona1);
         listPersonas.add(persona2);

        for(int x=0;x<listPersonas.size();x++){
           System.out.println("Registro "+ (x+1) + ": " + listPersonas.get(x));
        }

        try{
            FileWriter newFile =new FileWriter("./listPersonas.json"); 
            newFile.write(listPersonas.toJSONString());
            newFile.close();
        }catch(IOException io){
            System.out.println("Error: " + io);
        }
//        System.out.println(persona1.get("nombre") + " - " +persona1.get("telefono"));
 //       System.out.println(persona2.get("nombre") + " - " +persona2.get("telefono"));


 JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("./listEmpleados.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray listEmpleados = (JSONArray) obj;
            System.out.println("Lista de empleados:\n"+listEmpleados);

//ACTUALICE un registro
            JSONObject temp = (JSONObject) listEmpleados.get(1);
            System.out.println("Nombre Filtrado: " + temp.get("name"));
            temp.put("name","Sofia");
            listEmpleados.set(1, temp);

            System.out.println("Lista de empleados actualizados:\n"+listEmpleados);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
*/
    }
    
}
