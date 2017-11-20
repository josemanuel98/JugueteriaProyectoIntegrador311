/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jugueteria311.gui;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainPanel extends javafx.application.Application {
    @FXML Button btnCliente;
    @FXML Button btnEmpleado;
    @FXML Button btnProducto;
    
    FXMLLoader fxmll;
    Scene scene;
    Stage window;
    ClientePanel clientePanel;
    EmpleadoPanel empleadoPanel;
    ProductoPanel productoPanel;
    
    public MainPanel(){
        super();
        fxmll = new FXMLLoader(System.class.getResource("/org/jugueteria311/gui/fxml/MainPanel.fxml"));
        fxmll.setController(this);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            fxmll.load();
            
            scene = new Scene(fxmll.getRoot());
            window = primaryStage;
            window.setScene(scene);
            primaryStage.setScene(scene);
//            inicializarComponentes();
            
            window.setTitle("Jugueteria Wonka");
            window.show();

        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
    
//    private void inicializarComponentes() throws Exception{
//        window.setOnCloseRequest(evt -> {System.exit(0);});
//        clientePanel = new ClientePanel();
//        empleadoPanel = new EmpleadoPanel();
//        productoPanel = new ProductoPanel();
//        clientePanel.start();
//        empleadoPanel.start();
//        btnCliente.setOnAction(evt -> {
//            clientePanel.setVisible(true);
//        });
//        btnEmpleado.setOnAction(evt -> {
//            empleadoPanel.setVisible(true);
//        });
//        btnProducto.setOnAction(evt -> {
//            productoPanel.setVisible(true);
//        });
//    }
}