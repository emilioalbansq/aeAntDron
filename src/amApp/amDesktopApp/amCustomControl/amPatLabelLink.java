package amApp.amDesktopApp.amCustomControl;

import javax.swing.ImageIcon;

import amInfrastructure.AppStyle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class amPatLabelLink extends amPatLabel implements MouseListener {

    amPatLabelLink(String text){
        super(text);
        setPersonalizacion();
    }

    amPatLabelLink(String text, String iconPath){
        super(text);
        setPersonalizacion();
        setIcon(new ImageIcon(iconPath));
    }
    
    void setPersonalizacion(){
        addMouseListener(this);
        setOpaque(false);
        setForeground(AppStyle.COLOR_FONT);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // code
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // code
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // code
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setCursor(AppStyle.CURSOR_HAND);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setCursor(AppStyle.CURSOR_DEFAULT);
    }
}
