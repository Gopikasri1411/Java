import javax.imageio.IIOException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Gopika extends Frame implements Runnable,ActionListener {
    TextField textField;
    TextArea textArea;
    Button send;
    Socket socket;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    Thread chat;
    Gopika(){
        textField =new TextField();
        textArea=new TextArea();
        send=new Button("send");
        send.addActionListener(this);
        try{
            socket=new Socket("localhost",12000);
            dataInputStream=new DataInputStream(socket.getInputStream());
            dataOutputStream=new DataOutputStream(socket.getOutputStream());
        }
        catch (Exception e){

        }
        chat=new Thread(this);
        chat.setDaemon(true);
        chat.start();
        add(textField);
        add(textArea);
        add(send);
        setSize(500,500);
        setTitle("Gopika");
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String msg=textField.getText();
        textArea.append("Gopika: "+msg+"\n");
        textField.setText("");
        try{
            dataOutputStream.writeUTF(msg);
            dataOutputStream.flush();
        }catch (IOException ex){

        }
    }


    public static void main(String[] args) {
        new Gopika();
    }
    public void run(){
        while(true){
            try{
                String msg=dataInputStream.readUTF();
                textArea.append("Madhu: "+msg+"\n");
            }
            catch (Exception e){

            }
        }
    }
}
