import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Zadanie1 extends JFrame implements ActionListener {

    //DEKLAROWANIE POTRZEBNYCH ELEMENTÓW
    private JMenuBar menuBar;
    private JMenu menuFile, menuEdit;
    private JMenuItem mProject, mFile, mCheck1, mCheck2, mRadio1, mRadio2, mSubMenu;
    private JTextField tfLiczba1, tfLLiczba2, tfWynik, tfOperator;
    private JLabel lLiczba1, lLiczba2, lWynik, lOperator;
    private JButton bOblicz, bWyjście;

    public Zadanie1(){
        //SZCZEGÓŁY OKNA GŁÓWNEGO APLIKACJI
        setSize(400,200);
        setTitle("Menu Demo");
        setLayout(null);

        //TASKS IN BOOKMARKS
        mProject = new JMenuItem("New Project...");
        mFile = new JMenuItem("New File...");
        mCheck1 = new JMenuItem("A check box menu item");
        mCheck2 = new JMenuItem("Another one");
        mRadio1 = new JMenuItem("Radio button menu item");
        mRadio2 = new JMenuItem("Another radio button");
        mSubMenu = new JMenuItem("A submenu");

        //BOOKMARKS
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");

        //DODANIE MENU BAR DO OKNA I DODANIE ZAKŁADEK
        setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuBar.add(menuEdit);


        //DODANIE ZAKŁADEK DO OKNA
        menuFile.add(mProject);
        menuFile.add(mFile);
        menuFile.addSeparator();
        menuFile.add(mCheck1);
        menuFile.add(mCheck2);
        menuFile.addSeparator();
        menuFile.add(mRadio1);
        menuFile.add(mRadio2);
        menuFile.addSeparator();
        menuFile.add(mSubMenu);
        //LABELS
        lLiczba1 = new JLabel("Liczba 1", JLabel.RIGHT);
        lLiczba1.setBounds(10,0,50,30);
        lLiczba2 = new JLabel("Liczba 2", JLabel.RIGHT);
        lLiczba2.setBounds(180,0,50,30);
        lWynik = new JLabel("Wynik",JLabel.RIGHT);
        lWynik.setBounds(260,0,50,30);
        lOperator = new JLabel("Operator", JLabel.RIGHT);
        lOperator.setBounds(85,0,60,30);

        //TEXTFIELDS
        tfLiczba1 = new JTextField();
        tfLiczba1.setBounds(10,30,60,30);
        tfLiczba1.setToolTipText("Podaj pierwszą liczbę");
        tfLLiczba2 = new JTextField();
        tfLLiczba2.setBounds(180,30,60,30);
        tfLLiczba2.setToolTipText("Podaj drugą liczbę");
        tfWynik = new JTextField();
        tfWynik.setBounds(260,30,60,30);
        tfWynik.setToolTipText("Tu wyświetli się wynik");
        tfOperator = new JTextField();
        tfOperator.setBounds(90,30,60,30);
        tfOperator.setToolTipText("Tu wyświetla się operator którego aktualnie używasz");

        //DODAWANIE DO OKNA PRZYGOTOWANYCH TEXTFIELDS I LABELS
        add(tfLiczba1);
        add(tfLLiczba2);
        add(tfOperator);
        add(tfWynik);
        add(lLiczba1);
        add(lLiczba2);
        add(lWynik);
        add(lOperator);

        //INICJALIZACJA PRZYCISKÓW
        bOblicz = new JButton("Oblicz");
        bOblicz.setBounds(50,100,90,30);
        bOblicz.addActionListener(this);
        bWyjście = new JButton("Wyjście");
        bWyjście.setBounds(250,100,90,30);
        bWyjście.addActionListener(this);

        //DODAWANIE PRZYCISKÓW
        add(bOblicz);
        add(bWyjście);
    }

    public static void main(String[] args){
        Zadanie1 app = new Zadanie1();
        app.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        //dodajemy defaultową operacje zamknięcia
        app.setVisible(true);

    }
    //przeciążona metoda actionPerformed pozwala mi korzystanie z przycisków i mówi co dalej robić po kliknięciu za pomocą IF'ów.
    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodło = e.getSource();
        if(zrodło == bWyjście){
            dispose();
        }else if (zrodło == bOblicz){
            double liczba1 = Integer.parseInt(tfLiczba1.getText());
            double liczba2 = Integer.parseInt(tfLLiczba2.getText());
            Mnożenie mnozenie = new Mnożenie(liczba1, liczba2);
            double rozwiazanie = mnozenie.rozwiąż();
            //String.valueOf przekształca typ double na Stringa
            tfWynik.setText(String.valueOf(rozwiazanie));


        }
    }
}
