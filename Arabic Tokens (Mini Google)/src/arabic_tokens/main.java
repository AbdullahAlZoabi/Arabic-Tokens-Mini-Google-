

package arabic_tokens;
//included files----------------------------------------------------------------
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class main extends javax.swing.JFrame {

  
    
public int i;//files processing counter
    
public int number_of_file=0;//total file in folder that selected   

public  int number_of_word=0;

public  int number_of_line=0;

public   int number_of_curnt_lin=0; 

public boolean edtion=true;


public Hashtable<String,Word> allwodd= new Hashtable<String,Word>();

public Hashtable<String,String> allwoddstop= new Hashtable<String,String>();

public File[] listOfFiles;

public DefaultListModel list;

public DefaultTableModel table; 

private String NewTextDocument;

  //constractor-----------------------------------------------------------------  
    public main() {
     
    
        initComponents();
        
        insert();//loadig stop word from file to stop word list and hashtable
    
    
    
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jFrame5 = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Start Process Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jList1.setModel( new DefaultListModel());
        jScrollPane2.setViewportView(jList1);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton3.setText("add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Show Data");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel2.setText(" Number Of Stop Word");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(table = new DefaultTableModel() );
        jTable1.setMaximumSize(new java.awt.Dimension(100000, 100000));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setText("Number of File");

        jLabel3.setText("Number of Line");

        jLabel4.setText("Number of Word");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
@SuppressWarnings({"unchecked", "unchecked", "unchecked", "unchecked"})

//selct file Button--------------
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed



      JFileChooser j = new JFileChooser();
     
     j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     
     Integer opt = j.showOpenDialog(this);
     
     File x=j.getSelectedFile();
     
     String f=x.getAbsolutePath();
     
     jTextField1.setText(f);
     
     File folder = new File(f);
   
     listOfFiles = folder.listFiles();
     
      number_of_file= listOfFiles.length;

      
      
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
//start processing data  Button-------------------------------------------------    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

  if( number_of_file==0)
  {
   JFrame frame = new JFrame("Sample frame");
 
   JOptionPane.showMessageDialog(frame, "No Selected Folder or Folder is empty");
   
  }
 
  
  else
   {
  
if(edtion){
 
allwodd.clear();//clearing hash table to reprocessind data

i=0;
 
number_of_word=0;
 

number_of_line=0;
  
 
start_processing();//processing data
 
 edtion=false;//if add or delete stop word  reproccissing data undr new stop word
                  
            }
   
  else
  {
   
   JFrame frame = new JFrame("Sample frame");
 
   JOptionPane.showMessageDialog(frame, "The Data is processed you can show table or search");
   
 
   }
   
   
   
   }
  
   
 
    
  


    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

       
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       
    }//GEN-LAST:event_jTextField3ActionPerformed

    
    
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
     
    }//GEN-LAST:event_jTextField4ActionPerformed



//add stop word   Button--------------------------------------------------------  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(jTextField5.getText().isEmpty())
{JFrame frame = new JFrame("Sample frame");
 
 JOptionPane.showMessageDialog(frame, "No Stop word Entered");

}
        
else if(allwoddstop.contains(jTextField5.getText()))
{
  JFrame frame = new JFrame("Sample frame");
 
  JOptionPane.showMessageDialog(frame, "The Stop word  already in List ");

}

else{

    list=(DefaultListModel) jList1.getModel(); 

    list.addElement(jTextField5.getText());

    allwoddstop.put(jTextField5.getText(), jTextField5.getText());


    jTextField5.setText("");
    
    edtion=true;

    updatefile();//update stop word file

     }

    }//GEN-LAST:event_jButton3ActionPerformed

    
 //delre stop word button-------------------------------------------------------   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(jTextField5.getText().isEmpty())
{

  JFrame frame = new JFrame("Sample frame");
 
  JOptionPane.showMessageDialog(frame, "No Stop word Entered");


}

else if(!allwoddstop.containsKey(jTextField5.getText()))
{

    
JFrame frame = new JFrame("Sample frame");
 
JOptionPane.showMessageDialog(frame, "No Stop Word as This In List");


}
else if(allwoddstop.containsKey(jTextField5.getText()))
{

    
allwoddstop.remove(jTextField5.getText(),jTextField5.getText());

list.removeElement(jTextField5.getText());

jTextField5.setText("");

edtion=true;

updatefile();//updata stop word to file-----------------------------------------

}

    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    
    //print tablie and ather data-----------------------------------------------
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
if(allwodd.isEmpty())
{
    JFrame frame = new JFrame("Sample frame");
 
    JOptionPane.showMessageDialog(frame, "No Processed Data To show");

}
        

else
{
    jTable1.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
    
    table.setRowCount(0);//clear row
       
    table.setColumnCount(0);//clear colom
       
     print_table();//breant tokins list word to table
     
     jTextField2.setText(Integer.toString(number_of_file));
   
     jTextField4.setText(Integer.toString(number_of_line));
   
     jTextField3.setText(Integer.toString(number_of_word));
   
     jTextField9.setText(Integer.toString(list.size()));   


}


    }//GEN-LAST:event_jButton6ActionPerformed

    
    
 //search button----------------------------------------------------------------
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(number_of_word==0)
{

JFrame frame = new JFrame("Sample frame");
 
JOptionPane.showMessageDialog(frame, "Sorry ! No data are processed  ");                          

} 
        
        
        else if(jTextField7.getText().isEmpty())
{JFrame frame = new JFrame("Sample frame");
 
 JOptionPane.showMessageDialog(frame, "Enter Word for search ");

}
else{        
   
    
    table.setRowCount(0);
       
    table.setColumnCount(0);
       
    jTable1.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
       
    search(jTextField7.getText());



    }

    }//GEN-LAST:event_jButton7ActionPerformed

    
    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
  
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
    
    }//GEN-LAST:event_jTextField5ActionPerformed

    
//procissing data function------------------------------------------------------    
public void start_processing()
{
      
for(i=0;i<number_of_file;i++)//looping for each line

   {
       
       number_of_curnt_lin=0;//for detrmine line for each word
     
       BufferedReader br = null;
    
       try {
        br = new BufferedReader(new FileReader(listOfFiles[i]));
        
            } 
    
    catch (FileNotFoundException ex) {
        
            
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
    
       
                                     }

   String line;
    try {
        
        while ((line = br.readLine()) != null)
        {
           number_of_line++;
           number_of_curnt_lin++;
           processing_witht_this_line(line);
            
        }   
    
    } 
    
    catch (IOException ex) 
    
    {
    
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
   
    }
   
   
   }
    
    
   }
    
    
@SuppressWarnings({"unchecked", "unchecked", "unchecked", "unchecked"})
  
//slipt each line and pass words to insert function-----------------------------
public void processing_witht_this_line(String line)
  {
    
    StringTokenizer tokens = new StringTokenizer(line, " /\\/\"=+-()*&^%$#@!/,/~1234567890><|!?._");
    
    
    String splited;
    
    
    
    while(tokens.hasMoreTokens())
    {
        splited = tokens.nextToken();
        
        if(!allwoddstop.contains(splited)&& splited.length()>=3)
        { //first cheak if stob word
          
            insert_thes_word_word_stor(splited);
         
            number_of_word++;
        
            
        }
        
       
   
    
    }
    
 
  }     
    
    
@SuppressWarnings({"unchecked", "unchecked"})


//isert slipted word in hashtable-----------------------------------------------
public void insert_thes_word_word_stor(String word)
    {
 
        
if(allwodd.containsKey(word))//if word in hashtable
    {
        
         
  Word temp=new Word(number_of_file);
   
  temp= allwodd.get(word);
   
  temp.totalgorthisword++;
  
  temp.counrforeachword[i]++;
  
  obeict tep=new obeict();
   
  tep.file_num=i;
   
  tep.line_num=number_of_curnt_lin;
   
  temp.pair.add(tep);
  
 
   allwodd.replace(word, temp);
   
 
   }
  
   
   
   else//if new word
       
    { 
    
  Word temp=new Word(number_of_file);
   
  
  temp.totalgorthisword=1;
  
  temp.counrforeachword[i]=1;
  
  temp.data=word;
  
  obeict tep=new obeict();
   
  tep.file_num=i;
   
  tep.line_num=number_of_curnt_lin;
   
  temp.pair.add(tep);
   
  allwodd.put(word, temp);
   
    
   
    }
    
     
    }    
    
    
@SuppressWarnings({"unchecked", "unchecked", "unchecked", "unchecked"})


//print table-------------------------------------------------------------------
public void print_table()
{
    table.addColumn("Word");
    
    for(int h=0;h<number_of_file;h++)
    table.addColumn(listOfFiles[h].getName());
   
    
    table.addColumn("Total");
    
   
    
    Enumeration elments=allwodd.elements();
        
    while (elments.hasMoreElements())
    {
     
    Word v;
  
    v = new Word(number_of_file);
  
    v=(Word) elments.nextElement();
   
    Object [] row =new Object[number_of_file+2];
    
    row[0]=v.data;
     
    for(int n=0;n<number_of_file;n++)
        row[n+1]=v.counrforeachword[n];
    
    row[number_of_file+1]=v.totalgorthisword;
   
    
    table.addRow(row);
    
    
   }
   
   

}   
  

//search for word---------------------------------------------------------------
public void search(String word)
{


if(!allwodd.containsKey(word))
{
JFrame frame = new JFrame("Sample frame");
 
   JOptionPane.showMessageDialog(frame, "Sorry ! no result for "+word);                          
}

else
{table.addColumn("file name");
table.addColumn("line number");
table.addColumn("   line                                            ");

Object [] g=new Object[3];

Word temp=new Word(number_of_file);

temp=allwodd.get(word);


for(int y=0;y<temp.pair.size();y++)
{

g[0]=listOfFiles[temp.pair.get(y).file_num].getName();
g[1]=temp.pair.get(y).line_num;
g[2]=giv_me_this_line(temp.pair.get(y).file_num , temp.pair.get(y).line_num);

table.addRow(g);

}
}

}




//thes function take file number and line number and return line----------------
public String giv_me_this_line(int j,int k)
{number_of_curnt_lin=0;
   BufferedReader br = null;
    
   try {
        br = new BufferedReader(new FileReader(listOfFiles[j]));
        
        } 
    
    catch (FileNotFoundException ex) {
        
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
    
       
                                       }

   String line;
    try {
        while ((line = br.readLine()) != null)
        {
           
           number_of_curnt_lin++;
           
           if(number_of_curnt_lin==k)
               return line;
           
           
        }   
    
    } catch (IOException ex) 
    {
    
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
   
    }
    
    
    
    return "" ;
}



//update stop word file when add & delete stop word-----------------------------
public void updatefile()
{
   PrintWriter writer = null;
    try {

        writer = new PrintWriter("NewTextDocument.txt", "UTF-8");
        
    } 
    catch (FileNotFoundException ex) {
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedEncodingException ex) {
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
    }



Enumeration elments=allwoddstop.elements();
        
    while (elments.hasMoreElements())
    {
     
 
  
     String word= (String) elments.nextElement();
  
    
    writer.write(word+" ");
    
           
    }

writer.close();


}



//when boot program insert each word from stop word to hashtable and list-------
public void insert()
{


      BufferedReader br = null;
    try {
       
        
        br = new BufferedReader(new FileReader("NewTextDocument.txt"));
        
        
    } 
    
    catch (FileNotFoundException ex) {
        
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
    
       
                                       }

   String line;
    try {
        while ((line = br.readLine()) != null)
        {
         
        
           StringTokenizer tokens = new StringTokenizer(line, " ");
    
          String splited;
    
   
    
    while(tokens.hasMoreTokens())
    {
        splited= tokens.nextToken();
       
        allwoddstop.put(splited,splited );
         
        list=(DefaultListModel) jList1.getModel(); 

          list.addElement(splited);
        
  
    }
            
        
        
        }   
    
    } catch (IOException ex) 
    {
    
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
   
    }
   
   
   }





public static void main(String args[]) {
 
 
    
           
 
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 
                new main().setVisible(true);
                
         
            }
        
        }
       
        );
        
       

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables



    
}