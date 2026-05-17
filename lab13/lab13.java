package lab13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab13 extends JFrame {
	private static final long serialVersionUID = 1L;
    private JTextField massField, volumeField;
    private JComboBox<String> massUnitCombo, volumeUnitCombo;
    private JLabel resultLabel;

    public lab13() {
        setTitle("Биетийн нягт тооцоологч");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel(" Масс:"));
        massField = new JTextField();
        add(massField);

        add(new JLabel(" Масс нэгж:"));
        String[] massUnits = {"кг (kg)", "грамм (g)"};
        massUnitCombo = new JComboBox<>(massUnits);
        add(massUnitCombo);

        add(new JLabel(" Эзлэхүүн:"));
        volumeField = new JTextField();
        add(volumeField);

        add(new JLabel(" Эзлэхүүн нэгж:"));
        String[] volumeUnits = {"м3 (m3)", "см3 (cm3)"};
        volumeUnitCombo = new JComboBox<>(volumeUnits);
        add(volumeUnitCombo);

        JButton calcButton = new JButton("Тооцоолох");
        add(calcButton);

        resultLabel = new JLabel(" Нягт: - ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(resultLabel);

        calcButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                calculateDensity();
            }
        });

        setVisible(true);
    }

    private void calculateDensity() {
        try {
            if (massField.getText().isEmpty() || volumeField.getText().isEmpty()) {
                throw new Exception("Утгуудыг бүрэн бөглөнө үү!");
            }

            double mass = Double.parseDouble(massField.getText());
            double volume = Double.parseDouble(volumeField.getText());

            if (volume == 0) {
                throw new ArithmeticException("Эзлэхүүн 0 байж болохгүй!");
            }
            
            if (mass < 0 || volume < 0) {
                throw new Exception("Масс эсвэл эзлэхүүн сөрөг байж болохгүй!");
            }

            if (massUnitCombo.getSelectedIndex() == 1) mass /= 1000.0; // g -> kg
            if (volumeUnitCombo.getSelectedIndex() == 1) volume /= 1000000.0; // cm3 -> m3

            double density = mass / volume;

            resultLabel.setText(String.format(" Нягт: %.2f кг/м3", density));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Алдаа: Та зөвхөн тоон утга оруулна уу!", 
                "Оролтын алдаа", 
                JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, 
                "Алдаа: " + ex.getMessage(), 
                "Тооны алдаа", 
                JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, 
                "Алдаа: " + ex.getMessage(), 
                "Алдаа", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
                new lab13();
            }
        });
    }
}