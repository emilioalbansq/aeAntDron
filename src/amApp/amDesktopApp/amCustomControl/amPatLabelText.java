package amApp.amDesktopApp.amCustomControl;

import javax.swing.*;

import amInfrastructure.AppStyle;

import java.awt.*;

public class amPatLabelText extends JPanel{
    private amPatLabel    lblEtiqueta = new amPatLabel();
    private amPatTextBox  txtContenido= new amPatTextBox();

    public amPatLabelText(String etiqueta) {
        setLayout(new BorderLayout());

        lblEtiqueta.setCustomizeComponent(  etiqueta, 
                                            AppStyle.FONT_SMALL, 
                                            AppStyle.COLOR_FONT_LIGHT, 
                                            AppStyle.ALIGNMENT_LEFT); 
        add(lblEtiqueta, BorderLayout.NORTH);
        add(txtContenido, BorderLayout.CENTER);
    }
}
