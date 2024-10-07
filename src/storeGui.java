import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

public class storeGui  implements ActionListener {


    int cartProducts;
    JFrame frame1, frame2, frame3;
    JTextField name, ID, address, numProducts;
    JButton submit, addButton1, removeButton1, orderButton, addButton2, removeButton2, addButton3, removeButton3;
    JLabel nameLabel, idLabel, addressLabel, morrLabel, f2_nameLabel1, f2_nameLabel2, f2_idLabel1, f2_idLabel2;
    JLabel f2_addressLabel1, f2_addressLabel2, electoronicProd1, clothingProd1, bookProd1, electoronicProd2, clothingProd2, bookProd2;
    JLabel inCart1, inCart2, inCart3, inCartn1, inCartn2, inCartn3, nummProduct, cartFull;
    JPanel border1;
    int i1, i2, i3;

    ElectronicProduct electronicProduct;
    ClothingProduct clothingProduct;
    BookProduct bookProduct;
    Customer customer;
    Cart cart;







    storeGui(){

        electronicProduct = new ElectronicProduct(23, "Smartphone", 1500, "Samsung", 7);
       clothingProduct = new ClothingProduct(13, "T-Shirt", 1700, "Medium ", "bollister");
       bookProduct = new BookProduct(67, "Harry Potter", 170, "Khaled Hammad", "sha3ban 3bd elr7eem");
       customer = new Customer();
       cart = new Cart();

         frame1 = new JFrame("Morr's Store");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(700, 450);
        frame1.setLayout(null);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
            frame1.getContentPane().setBackground(new Color(0x27403d));

        morrLabel = new JLabel();
        morrLabel.setText("Welcome to E-Commerce System");
        morrLabel.setBounds(110 ,  20   , 1000 , 30);
        morrLabel.setFont(new Font("Rastanty Cortez", Font.PLAIN, 30));
        morrLabel.setForeground(new Color(0xe35d24));
        frame1.add(morrLabel);

        name =  new JTextField();
        name.setBounds(280, 80, 230, 30);
        name.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));
        frame1.add(name);

        nameLabel = new JLabel();
        nameLabel.setText("Name :");
        nameLabel.setBounds(200  ,80 , 80190 , 30);
        nameLabel.setForeground(new Color(0xe35d24));

        nameLabel.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));
        frame1.add(nameLabel);


        ID =  new JTextField();
        ID.setBounds(280, 150, 230, 30);
        ID.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));

        frame1.add(ID);


        numProducts =  new JTextField();
        numProducts.setBounds(580, 300, 60, 30);
        numProducts.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));

        frame1.add(numProducts);


        nummProduct = new JLabel();
        nummProduct.setText("Number of Products :");
        nummProduct.setBounds(440  , 300 , 190 , 30);
        nummProduct.setFont(new Font("Rastanty Cortez", Font.PLAIN, 14));
        nummProduct.setForeground(new Color(0xe35d24));
        frame1.add(nummProduct);

        idLabel = new JLabel();
        idLabel.setText("ID :");
        idLabel.setBounds(233  , 150 , 190 , 30);
        idLabel.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));
        idLabel.setForeground(new Color(0xe35d24));

        frame1.add(idLabel);





        address =  new JTextField();
        address.setBounds(280, 220, 230, 30);
        address.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));

        frame1.add(address);

        addressLabel = new JLabel();
        addressLabel.setText("Address :");
        addressLabel.setBounds(181  , 220 , 190 , 30);
        addressLabel.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));
        addressLabel.setForeground(new Color(0xe35d24));

        frame1.add(addressLabel);


        submit = new JButton("Submit");
        submit.setBounds(280, 300, 100, 30);
        submit.setFocusable(false);
        frame1.add(submit);
        submit.addActionListener(this);




        frame2 = new JFrame("Morr's Store");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1000, 600);
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);
        frame2.setResizable(false);
        frame2.getContentPane().setBackground(new Color(0x27403d));



        addButton1 = new JButton("Add");
        addButton1.setBounds(690, 180, 100, 30);
        addButton1.setFocusable(false);
        addButton1.setBackground(new Color(0xf1dee8));
        frame2.add(addButton1);
        addButton1.addActionListener(this);

        removeButton1 = new JButton("Remove");
        removeButton1.setBounds(820, 180, 100, 30);
        removeButton1.setFocusable(false);
        removeButton1.setBackground(new Color(0xf1dee8));
        frame2.add(removeButton1);
        removeButton1.addActionListener(this);

        addButton2 = new JButton("Add");
        addButton2.setBounds(690, 290, 100, 30);
        addButton2.setFocusable(false);
        addButton2.setBackground(new Color(0xf1dee8));
        frame2.add(addButton2);
        addButton2.addActionListener(this);

        removeButton2 = new JButton("Remove");
        removeButton2.setBounds(820, 290, 100, 30);
        removeButton2.setFocusable(false);
        removeButton2.setBackground(new Color(0xf1dee8));
        frame2.add(removeButton2);
        removeButton2.addActionListener(this);



        addButton3 = new JButton("Add");
        addButton3.setBounds(690, 400, 100, 30);
        addButton3.setFocusable(false);
        addButton3.setBackground(new Color(0xf1dee8));
        frame2.add(addButton3);
        addButton3.addActionListener(this);

        removeButton3 = new JButton("Remove");
        removeButton3.setBounds(820, 400, 100, 30);
        removeButton3.setFocusable(false);
        removeButton3.setBackground(new Color(0xf1dee8));
        frame2.add(removeButton3);
        removeButton3.addActionListener(this);

        orderButton = new JButton("Order");
        orderButton.setBounds(430, 500, 100, 30);
        orderButton.setFocusable(false);
        orderButton.setBackground(new Color(0xf1dee8));
        frame2.add(orderButton);
        orderButton.addActionListener(this);







        electoronicProd1 = new JLabel();
        electoronicProd1.setText("Product :");
        electoronicProd1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        electoronicProd1.setBounds(21 , 175 , 190 ,40);
        electoronicProd1.setForeground(new Color(0xe35d24));
        frame2.add(electoronicProd1);

        electoronicProd2 = new JLabel();
        electoronicProd2.setText("Smartphone");
        electoronicProd2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        electoronicProd2.setBounds(120 , 175 , 190 ,40);
        electoronicProd2.setForeground(new Color(0xf1dee8));
        frame2.add(electoronicProd2);



        clothingProd1 = new JLabel();
        clothingProd1.setText("Product :");
        clothingProd1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        clothingProd1.setBounds(21 , 285 , 190 ,40);
        clothingProd1.setForeground(new Color(0xe35d24));
        frame2.add(clothingProd1);
        clothingProd2 = new JLabel();
        clothingProd2.setText("T-Shirt");
        clothingProd2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        clothingProd2.setBounds(120 , 285 , 190 ,40);
        clothingProd2.setForeground(new Color(0xf1dee8));
        frame2.add(clothingProd2);





        bookProd1 = new JLabel();
        bookProd1.setText("Product :");
        bookProd1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        bookProd1.setBounds(21 , 395 , 190 ,40);
        bookProd1.setForeground(new Color(0xe35d24));
        frame2.add(bookProd1);
        bookProd2 = new JLabel();
        bookProd2.setText("Harry Potter Book");
        bookProd2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        bookProd2.setBounds(120 , 395 , 190 ,40);
        bookProd2.setForeground(new Color(0xf1dee8));
        frame2.add(bookProd2);








        f2_nameLabel1 = new JLabel();
        f2_nameLabel1.setText("Name :");
        f2_nameLabel1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
        f2_nameLabel1.setBounds(21 , 50 , 190 ,40);
        f2_nameLabel1.setForeground(new Color(0xe35d24));
        frame2.add(f2_nameLabel1);

        f2_nameLabel2 = new JLabel();
        f2_nameLabel2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
        f2_nameLabel2.setBounds(98 , 50 , 500 ,40);
        f2_nameLabel2.setForeground(new Color(0xf1dee8));




        f2_idLabel1 = new JLabel();
        f2_idLabel1.setText("ID :");
        f2_idLabel1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
        f2_idLabel1.setBounds(420 , 50 , 190 ,40);
        f2_idLabel1.setForeground(new Color(0xe35d24));
        frame2.add(f2_idLabel1);

        f2_idLabel2 = new JLabel();
        f2_idLabel2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
        f2_idLabel2.setBounds(460 , 50 , 190 ,40);
        f2_idLabel2.setForeground(new Color(0xf1dee8));


        f2_addressLabel1 = new JLabel();
        f2_addressLabel1.setText("Address :");
        f2_addressLabel1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
        f2_addressLabel1.setBounds(700 , 50 , 190 ,40);
        f2_addressLabel1.setForeground(new Color(0xe35d24));
        frame2.add(f2_addressLabel1);

        f2_addressLabel2 = new JLabel();
        f2_addressLabel2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
        f2_addressLabel2.setBounds(782 , 50 , 190 ,40);
        f2_addressLabel2.setForeground(new Color(0xf1dee8));



        inCart1 = new JLabel();
        inCart1.setText("in cart:");
        inCart1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        inCart1.setBounds(411 , 175 , 190 ,40);
        inCart1.setForeground(new Color(0xe35d24));
        frame2.add(inCart1);

        inCart2 = new JLabel();
        inCart2.setText("in cart:");
        inCart2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        inCart2.setBounds(411 , 285 , 190 ,40);
        inCart2.setForeground(new Color(0xe35d24));
        frame2.add(inCart2);


        inCart3 = new JLabel();
        inCart3.setText("in cart:");
        inCart3.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        inCart3.setBounds(411 , 395 , 190 ,40);
        inCart3.setForeground(new Color(0xe35d24));
        frame2.add(inCart3);

 i1 =0;
 i2 = 0;
 i3 = 0;
        inCartn1 = new JLabel();
        inCartn1.setText(String.valueOf(i1));
        inCartn1.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        inCartn1.setBounds(477 , 176 , 190 ,40);
        inCartn1.setForeground(new Color(0xf1dee8));
        frame2.add(inCartn1);

        inCartn2 = new JLabel();
        inCartn2.setText(String.valueOf(i2));
        inCartn2.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        inCartn2.setBounds(477 , 286 , 190 ,40);
        inCartn2.setForeground(new Color(0xf1dee8));
        frame2.add(inCartn2);


        inCartn3 = new JLabel();
        inCartn3.setText(String.valueOf(i3));
        inCartn3.setFont(new Font("Rastanty Cortez", Font.PLAIN, 20));
        inCartn3.setBounds(477 , 396 , 190 ,40);
        inCartn3.setForeground(new Color(0xf1dee8));
        frame2.add(inCartn3);



        cartFull = new JLabel();
        cartFull.setText("Cart is full");
        cartFull.setBounds(200 , 50 , 190 ,40);
        cartFull.setFont(new Font("Rastanty Cortez", Font.PLAIN, 19));
        cartFull.setForeground(Color.red);


        border1 = new JPanel();
        border1.setBounds(690 , 50 , 280 ,40);
        border1.setBackground(new Color(0x27403d));
        border1.setBorder(new LineBorder(Color.BLACK,1));




        frame1.setVisible(true);




        frame3 = new JFrame("Receipt");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(500, 600);
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        frame3.getContentPane().setBackground(new Color(0x27403d));

        JLabel receiptTitle = new JLabel("Receipt");
        receiptTitle.setBounds(200, 20, 100, 30);
        receiptTitle.setFont(new Font("Rastanty Cortez", Font.PLAIN, 24));
        receiptTitle.setForeground(new Color(0xe35d24));
        frame3.add(receiptTitle);

        JLabel customerInfo = new JLabel("Customer Name: " + customer.getName());
        customerInfo.setBounds(50, 60, 300, 30);
        customerInfo.setForeground(new Color(0xe35d24));
        frame3.add(customerInfo);

        JLabel customerID = new JLabel("Customer ID: " + customer.getCustomerId());
        customerID.setBounds(50, 100, 300, 30);
        customerID.setForeground(new Color(0xe35d24));
        frame3.add(customerID);

        JLabel customerAddress = new JLabel("Address: " + customer.getAddress());
        customerAddress.setBounds(50, 140, 300, 30);
        customerAddress.setForeground(new Color(0xe35d24));
        frame3.add(customerAddress);


    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
             cartProducts = Integer.parseInt(numProducts.getText());

            cart.setProducts(new ArrayList<Product>());

            f2_nameLabel2.setText(name.getText());
            frame2.add(f2_nameLabel2);
            customer.setName(name.getText());


            f2_idLabel2.setText(ID.getText());

            frame2.add(f2_idLabel2);
            customer.setCustomerId(Integer.parseInt(ID.getText()));
            cart.setCustomerId(Integer.parseInt(ID.getText()));




            f2_addressLabel2.setText(address.getText());
            frame2.add(f2_addressLabel2);
            frame2.add(border1);
            customer.setAddress(address.getText());


            System.out.println();
            frame1.setVisible(false);
           frame2.setVisible(true);

        }

        if (e.getSource() == addButton1) {

            if (cart.getnProducts() < cartProducts) {
                cart.addProduct(electronicProduct);
                inCartn1.setText(String.valueOf(++i1));
                cartFull.setVisible(false);
                frame2.remove(cartFull);
                frame2.repaint();
            } else {

                cartFull.setVisible(true);
                frame2.add(cartFull);
                frame2.repaint();
            }
        }

        if (e.getSource() == addButton2) {

            if (cart.getnProducts() < cartProducts) {
                cart.addProduct(clothingProduct);
                inCartn2.setText(String.valueOf(++i2));
                cartFull.setVisible(false);
                frame2.remove(cartFull);
                frame2.repaint();
            } else {

                cartFull.setVisible(true);
                frame2.add(cartFull);
                frame2.repaint();
            }
        }
        if (e.getSource() == addButton3) {

            if (cart.getnProducts() < cartProducts) {

                cart.addProduct(bookProduct);
                inCartn3.setText(String.valueOf(++i3));
                cartFull.setVisible(false);
                frame2.remove(cartFull);
                frame2.repaint();
            } else {

                cartFull.setVisible(true);
                frame2.add(cartFull);
                frame2.repaint();
            }
        }

        if(e.getSource() == removeButton1) {
            cart.removeProduct(electronicProduct);
            if (i1 == 0) {
                inCartn1.setText(String.valueOf(i1));
            } else {
                inCartn1.setText(String.valueOf(--i1));
                cartFull.setVisible(false);
                frame2.remove(cartFull);
                frame2.repaint();

            }
            }
        if(e.getSource() == removeButton2) {
            cart.removeProduct(clothingProduct);
            if (i2 == 0) {
                inCartn2.setText(String.valueOf(i2));
            } else {
                inCartn2.setText(String.valueOf(--i2));
                cartFull.setVisible(false);
                frame2.remove(cartFull);
                frame2.repaint();

            }
        }

        if(e.getSource() == removeButton3) {
            cart.removeProduct(bookProduct);
            if (i3 == 0) {
                inCartn3.setText(String.valueOf(i3));
            } else {
                inCartn3.setText(String.valueOf(--i3));
                cartFull.setVisible(false);
                frame2.remove(cartFull);
                frame2.repaint();

            }
        }

        if (e.getSource() == orderButton) {
            frame2.setVisible(false);

            frame3.getContentPane().removeAll();

            JLabel receiptLabel = new JLabel();
            JLabel thanksLabel = new JLabel();


            String receiptText = "<html>Receipt:<br/>" +
                    "Customer Name: " + customer.getName() + "<br/>" +
                    "Customer ID: " + customer.getCustomerId() + "<br/>" +
                    "Address: " + customer.getAddress() + "<br/><br/>" +
                    "Products Purchased:<br/>";

            for (Product product : cart.getProducts()) {
                receiptText += product.getName() + " - Price: " + product.getPrice() + "<br/>";
            }

            double totalAmount = cart.calculatePrice(); // Make sure this method is implemented
            receiptText += "<br/>Total Amount: " + totalAmount + "</html>";

            receiptLabel.setText(receiptText);

            receiptLabel.setBounds(20, 30, 460, 400);
            receiptLabel.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
            receiptLabel.setForeground(new Color(0xe35d24));
            frame3.add(receiptLabel);


            thanksLabel.setText("Thanks for shopping!");

            thanksLabel.setBounds(150, 290, 460, 400);
            thanksLabel.setFont(new Font("Rastanty Cortez", Font.PLAIN, 18));
            thanksLabel.setForeground(new Color(0xe35d24));
            frame3.add(thanksLabel);

            frame3.revalidate();
            frame3.repaint();

            frame3.setVisible(true);
        }







    }

    public static void main(String[] args) {
        storeGui storeGui = new storeGui();
    }

 }


















