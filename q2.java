import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample extends JFrame {

    public MenuExample() {
        // Create frame
        setTitle("Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu searchMenu = new JMenu("Search");

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(searchMenu);

        // Create a panel to display edit options
        JPanel editPanel = new JPanel();
        editPanel.setLayout(new GridLayout(5, 1));

        // Add buttons with icons to the edit panel
        JButton undoButton = new JButton("Undo", new ImageIcon("undo.png"));
        JButton redoButton = new JButton("Redo", new ImageIcon("redo.png"));
        JButton cutButton = new JButton("Cut", new ImageIcon("cut.png"));
        JButton copyButton = new JButton("Copy", new ImageIcon("copy.png"));
        JButton pasteButton = new JButton("Paste", new ImageIcon("paste.png"));

        // Add buttons to the panel
        editPanel.add(undoButton);
        editPanel.add(redoButton);
        editPanel.add(cutButton);
        editPanel.add(copyButton);
        editPanel.add(pasteButton);

        // Set the visibility of edit panel when 'Edit' menu is clicked
        editMenu.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                getContentPane().removeAll();
                getContentPane().add(editPanel);
                revalidate();
                repaint();
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) {}

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) {}
        });

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Set layout
        getContentPane().setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        // Run the GUI application
        SwingUtilities.invokeLater(() -> {
            MenuExample example = new MenuExample();
            example.setVisible(true);
        });
    }
}
