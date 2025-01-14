package za.ac.cput.ui.general;

import za.ac.cput.ui.customer.AddCustomerGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSideNavigationBar extends JPanel implements ActionListener {
    private JButton dashboard, customerManagement, employeeManagement, equipmentManagement, fileManagement, rentalManagement, about;
    private JLabel logo, userData;
    private ImageIcon iconLogo, iconDashboard, iconCustomer, iconEmployee, iconEquipment, iconRental, iconFile, iconAbout, iconCurrentUser, iconLogout;
    private JButton btnLogout;
    private Color background, buttonText, addictionColor;

    public AdminSideNavigationBar(String currentUser, String currentUserAccess, String imagePath, String activeMenu) {
        background = new Color(186,39,94);
        buttonText = Color.WHITE;
        addictionColor = new Color(166, 23, 76);

        this.userData = new JLabel("<html>" + currentUser +"<br/>" + currentUserAccess + "</html>");
        this.userData.setForeground(buttonText);
        this.userData.setFont(new Font("SansSerif Bold", Font.BOLD, 12));
        this.iconCurrentUser= new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));

        this.userData.setIcon(iconCurrentUser);


        this.setBackground(background);

        this.iconLogo = new ImageIcon("images/logo_white.png");
        this.logo = new JLabel();
        this.logo.setIcon(this.iconLogo);
        this.logo.setBackground(background);
        this.logo.setHorizontalAlignment(SwingConstants.CENTER);
        this.iconDashboard = new ImageIcon("images/nav-bar-icons/unselected/dashboard.png");
        this.iconCustomer = new ImageIcon("images/nav-bar-icons/unselected/customer.png");
        this.iconLogout = new ImageIcon("images/nav-bar-icons/logout.png");
        this.iconEmployee = new ImageIcon("images/nav-bar-icons/unselected/employee.png");
        this.iconEquipment = new ImageIcon("images/nav-bar-icons/unselected/equipment.png");
        this.iconRental = new ImageIcon("images/nav-bar-icons/unselected/rental.png");
        this.iconFile = new ImageIcon("images/nav-bar-icons/unselected/file.png");
        this.iconAbout = new ImageIcon("images/nav-bar-icons/unselected/about.png");

        this.dashboard = new JButton("Dashboard");
        this.dashboard.addActionListener(this);
        this.dashboard.setOpaque(false);
        this.dashboard.setContentAreaFilled(false);
        this.dashboard.setBorderPainted(false);
        this.dashboard.setFocusPainted(false);
        this.dashboard.setHorizontalAlignment(SwingConstants.LEFT);
        this.dashboard.setForeground(buttonText);
        this.dashboard.setFont(new Font("SansSerif Bold", Font.BOLD, 15));
        this.dashboard.setIcon(iconDashboard);
        this.dashboard.setIconTextGap(10);

        this.customerManagement = new JButton("Customer Management");
        this.customerManagement.addActionListener(this);
        this.customerManagement.setOpaque(false);
        this.customerManagement.setContentAreaFilled(false);
        this.customerManagement.setBorderPainted(false);
        this.customerManagement.setFocusPainted(false);
        this.customerManagement.setHorizontalAlignment(SwingConstants.LEFT);
        this.customerManagement.setForeground(buttonText);
        this.customerManagement.setFont(new Font("SansSerif Bold", Font.BOLD, 15));
        this.customerManagement.setIcon(iconCustomer);
        this.customerManagement.setIconTextGap(10);

        this.employeeManagement = new JButton("Employee Management");
        this.employeeManagement.addActionListener(this);
        this.employeeManagement.setOpaque(false);
        this.employeeManagement.setContentAreaFilled(false);
        this.employeeManagement.setBorderPainted(false);
        this.employeeManagement.setFocusPainted(false);
        this.employeeManagement.setHorizontalAlignment(SwingConstants.LEFT);
        this.employeeManagement.setForeground(buttonText);
        this.employeeManagement.setFont(new Font("SansSerif Bold", Font.BOLD, 15));
        this.employeeManagement.setIcon(iconEmployee);
        this.employeeManagement.setIconTextGap(10);

        this.equipmentManagement = new JButton("Equipment Management");
        this.equipmentManagement.addActionListener(this);
        this.equipmentManagement.setOpaque(false);
        this.equipmentManagement.setContentAreaFilled(false);
        this.equipmentManagement.setBorderPainted(false);
        this.equipmentManagement.setFocusPainted(false);
        this.equipmentManagement.setHorizontalAlignment(SwingConstants.LEFT);
        this.equipmentManagement.setForeground(buttonText);
        this.equipmentManagement.setFont(new Font("SansSerif Bold", Font.BOLD, 15));
        this.equipmentManagement.setIcon(iconEquipment);
        this.equipmentManagement.setIconTextGap(10);

        this.rentalManagement = new JButton("Rental Management");
        this.rentalManagement.addActionListener(this);
        this.rentalManagement.setOpaque(false);
        this.rentalManagement.setContentAreaFilled(false);
        this.rentalManagement.setBorderPainted(false);
        this.rentalManagement.setFocusPainted(false);
        this.rentalManagement.setHorizontalAlignment(SwingConstants.LEFT);
        this.rentalManagement.setForeground(buttonText);
        this.rentalManagement.setFont(new Font("SansSerif Bold", Font.BOLD, 15));
        this.rentalManagement.setIcon(iconRental);
        this.rentalManagement.setIconTextGap(10);

        this.fileManagement = new JButton("File Management");
        this.fileManagement.addActionListener(this);
        this.fileManagement.setOpaque(false);
        this.fileManagement.setContentAreaFilled(false);
        this.fileManagement.setBorderPainted(false);
        this.fileManagement.setFocusPainted(false);
        this.fileManagement.setHorizontalAlignment(SwingConstants.LEFT);
        this.fileManagement.setForeground(buttonText);
        this.fileManagement.setFont(new Font("SansSerif Bold", Font.BOLD, 15));
        this.fileManagement.setIcon(iconFile);
        this.fileManagement.setIconTextGap(10);

        this.about = new JButton("About");
        this.about.addActionListener(this);
        this.about.setOpaque(false);
        this.about.setContentAreaFilled(false);
        this.about.setBorderPainted(false);
        this.about.setFocusPainted(false);
        this.about.setHorizontalAlignment(SwingConstants.LEFT);
        this.about.setForeground(buttonText);
        this.about.setFont(new Font("SansSerif Bold", Font.BOLD, 15));
        this.about.setIcon(iconAbout);
        this.about.setIconTextGap(10);

        this.btnLogout = new JButton();
        this.btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("---> This should leave to the login page");
            }
        });
        this.btnLogout.setIcon(iconLogout);
        this.btnLogout.setBackground(addictionColor);
        this.btnLogout.setSize(50, 50);

        setActiveButton(activeMenu);
        JMenuBar menuBar = new VerticalMenuBar();
        menuBar.setBackground(background);
        menuBar.add(new JLabel());
        menuBar.add(this.logo);
        menuBar.add(new JLabel());
        menuBar.add(this.dashboard);
        menuBar.add(this.customerManagement);
        menuBar.add(this.employeeManagement);
        menuBar.add(this.equipmentManagement);
        menuBar.add(this.rentalManagement);
        menuBar.add(this.fileManagement);
        menuBar.add(this.about);
        menuBar.add(new JLabel());

        JPanel panelSouth = new JPanel(new BorderLayout());
        panelSouth.setBackground(addictionColor);
        panelSouth.add(userData, BorderLayout.CENTER);
        panelSouth.add(btnLogout, BorderLayout.EAST);


        JPanel container = new JPanel(new BorderLayout());
        container.add(menuBar, BorderLayout.CENTER);
        container.add(panelSouth, BorderLayout.SOUTH);

        this.add(container);

        setSize(new Dimension(500, 700));



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Dashboard")) {
            System.out.println("GO TO DASHBOARD");
        }
        else if(e.getActionCommand().equals("Customer Management")) {
            System.out.println("ADD A CUSTOMER MANAGEMENT");
            AddCustomerGUI addCustomerGUI = new AddCustomerGUI();
        }
        else if(e.getActionCommand().equals("Employee Management")) {
            System.out.println("GO TO EMPLOYEE MANAGEMENT");
        }
        else if(e.getActionCommand().equals("Equipment Management")) {
            System.out.println("GO TO EQUIPMENT MANAGEMENT");
        }
        else if(e.getActionCommand().equals("Rental Management")) {
            System.out.println("GO TO RENTAL MANAGEMENT");
        }
        else if(e.getActionCommand().equals("File Management")) {
            System.out.println("GO TO FILE MANAGEMENT");
        }
        else if(e.getActionCommand().equals("About")) {
            System.out.println("GO TO ABOUT");
        }

    }

    private void setActiveButton(String activeButton) {
        if(activeButton.equals("Dashboard")) {
            dashboard.setOpaque(true);
            dashboard.setBackground(buttonText);
            dashboard.setForeground(background);
            iconDashboard = new ImageIcon("images/nav-bar-icons/selected/dashboard.png");
            dashboard.setIcon(iconDashboard);
        }
        if(activeButton.equals("Customer Management")) {
            new AddCustomerGUI();
            customerManagement.setOpaque(true);
            customerManagement.setBackground(buttonText);
            customerManagement.setForeground(background);
            iconCustomer = new ImageIcon("images/nav-bar-icons/selected/customer.png");
            customerManagement.setIcon(iconCustomer);
        }
        if(activeButton.equals("Employee Management")) {
            employeeManagement.setOpaque(true);
            employeeManagement.setBackground(buttonText);
            employeeManagement.setForeground(background);
            iconEmployee = new ImageIcon("images/nav-bar-icons/selected/employee.png");
            employeeManagement.setIcon(iconEmployee);
        }
        if(activeButton.equals("Equipment Management")) {
            equipmentManagement.setOpaque(true);
            equipmentManagement.setBackground(buttonText);
            equipmentManagement.setForeground(background);
            iconEquipment = new ImageIcon("images/nav-bar-icons/selected/equipment.png");
            equipmentManagement.setIcon(iconEquipment);
        }
        if(activeButton.equals("Rental Management")) {
            rentalManagement.setOpaque(true);
            rentalManagement.setBackground(buttonText);
            rentalManagement.setForeground(background);
            iconRental = new ImageIcon("images/nav-bar-icons/selected/rental.png");
            rentalManagement.setIcon(iconRental);
        }
        if(activeButton.equals("File Management")) {
            fileManagement.setOpaque(true);
            fileManagement.setBackground(buttonText);
            fileManagement.setForeground(background);
            iconFile = new ImageIcon("images/nav-bar-icons/selected/file.png");
            fileManagement.setIcon(iconFile);
        }
        if(activeButton.equals("About")) {
            about.setOpaque(true);
            about.setBackground(buttonText);
            about.setForeground(background);
            iconAbout = new ImageIcon("images/nav-bar-icons/selected/about.png");
            about.setIcon(iconAbout);
        }
    }
}

class VerticalMenuBar extends JMenuBar {
    private static final LayoutManager grid = new GridLayout(0,1);
    public VerticalMenuBar() {
        setLayout(grid);
    }
}
