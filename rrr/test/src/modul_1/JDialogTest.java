package modul_1;

import javax.swing.*;
import java.awt.event.*;

public class JDialogTest extends JFrame
{
private static final long serialVersionUID = 1L;
public JDialogTest() {
super("Модальное или немодальное окно");
// Выход из программы при закрытии
setDefaultCloseOperation(EXIT_ON_CLOSE);
// Кнопки для создания диалоговых окон
JButton button1 = new JButton("Нет");
button1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JDialog dialog = createDialog("Немодальное", false);
dialog.setVisible(true);
}
});
JButton button2 = new JButton("Да");
button2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JDialog dialog = createDialog("Модальное", true);
dialog.setVisible(true);
}
});
// Создание панели содержимого с размещением кнопок
JPanel contents = new JPanel();
contents.add(button1);
contents.add(button2);
setContentPane(contents);
// Определение размера и открытие окна
setSize(650, 600);
setVisible(true);
}
/** Функция создания диалогового окна.
* @param title - заголовок окна
* @param modal - флаг модальности
*/
private JDialog createDialog(String title, boolean modal)
{
JDialog dialog = new JDialog(this, title, modal);
dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
dialog.setSize(580, 500);
return dialog;
}

public static void main(String[] args)
{
new JDialogTest();
}
}