package SemuaLatihan;
//Nama : FX.Bima Yudha Pratama
//NIM : 205314020
import java.awt.*;
import javax.swing.*;

public class Ch14JSliderSample extends JFrame{
    public Ch14JSliderSample() {
        Container contentPane;
        JPanel sliderPanel;

        //set the frame properties
        setSize(500, 300);
        setTitle("Program Ch14JListSample 205314020 FX.Bima Yudha Pratama");
        setLocation(20, 20);

        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        //create and place a JList
        sliderPanel = new JPanel(new FlowLayout());
        sliderPanel.setBorder(
                BorderFactory.createTitledBorder("RGB Color Selection"));

        JSlider redSlider = createSlider(255);
        JSlider greenSlider = createSlider(255);
        JSlider blueSlider = createSlider(255);
        sliderPanel.add(redSlider);
        sliderPanel.add(greenSlider);
        sliderPanel.add(blueSlider);

        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.white);
        colorPanel.setBorder(BorderFactory.createLoweredBevelBorder());
        contentPane.add(colorPanel, BorderLayout.CENTER);
        contentPane.add(sliderPanel, BorderLayout.WEST);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ch14JSliderSample frame = new Ch14JSliderSample();
        frame.setVisible(true);
    }
    private JSlider createSlider(int value ) {

        JSlider slider = new JSlider();

        slider.setOrientation(JSlider.VERTICAL);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMinimum(0);
        slider.setMaximum(255);
        slider.setValue(value);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(25);

         return slider;
    }


}
