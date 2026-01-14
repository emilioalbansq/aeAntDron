package aeApp.aeDesktopApp.aeCustomControl;

import javax.swing.*;

import aeInfrastructure.AppStyle;

import java.awt.*;

public class aePatLabelText extends JPanel{
    private aePatLabel    lblEtiqueta = new aePatLabel();
    private aePatTextBox  txtContenido= new aePatTextBox();

    public aePatLabelText(String etiqueta) {
        setLayout(new BorderLayout());

        lblEtiqueta.setCustomizeComponent(  etiqueta, 
                                            AppStyle.FONT_SMALL, 
                                            AppStyle.COLOR_FONT_LIGHT, 
                                            AppStyle.ALIGNMENT_LEFT); 
        add(lblEtiqueta, BorderLayout.NORTH);
        add(txtContenido, BorderLayout.CENTER);
    }
}
