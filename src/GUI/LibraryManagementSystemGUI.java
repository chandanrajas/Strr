package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystemGUI extends JFrame implements ActionListener {

    private Library library;
    private JTextArea displayArea;
    private JTextField bookTitleField, bookAuthorField, memberNameField, memberIdField;

    public LibraryManagementSystemGUI() {
        library = new Library();
        setTitle("Library Management System");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Setting up display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Arial", Font.PLAIN, 14));
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Input panel at the bottom
        JPanel inputPanel = createInputPanel();
        add(inputPanel, BorderLayout.SOUTH);

        // Button panel at the top
        JPanel buttonPanel = createButtonPanel();
        add(buttonPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 7, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(new Color(230, 230, 250)); // Light lavender background

        String[] buttonLabels = {
            "Add Book", "Add Member", "Borrow Book", "Return Book",
            "List All Books", "List Borrowed Books", "List Available Books"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            styleButton(button); // Add color styling to buttons
            button.addActionListener(this);
            panel.add(button);
        }

        return panel;
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(100, 149, 237)); // Cornflower blue background
        button.setForeground(Color.WHITE); // White text
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(70, 130, 180)), // Steel blue border
                BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));
    }

    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(new Color(245, 245, 245)); // Light gray background

        bookTitleField = createLabeledTextField(panel, "Book Title:");
        bookAuthorField = createLabeledTextField(panel, "Book Author:");
        memberNameField = createLabeledTextField(panel, "Member Name:");
        memberIdField = createLabeledTextField(panel, "Member ID:");

        return panel;
    }

    private JTextField createLabeledTextField(JPanel panel, String label) {
        panel.add(new JLabel(label));
        JTextField textField = new JTextField();
        panel.add(textField);
        return textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        int memberId;

        try {
            switch (command) {
                case "Add Book":
                    if (fieldsAreEmpty(bookTitleField, bookAuthorField)) {
                        displayMessage("Please enter both book title and author.");
                        return;
                    }
                    library.addBook(new Book(bookTitleField.getText(), bookAuthorField.getText()));
                    displayMessage("Book added successfully!");
                    break;

                case "Add Member":
                    if (fieldsAreEmpty(memberNameField, memberIdField)) {
                        displayMessage("Please enter both member name and ID.");
                        return;
                    }
                    memberId = Integer.parseInt(memberIdField.getText());
                    library.registerMember(new Member(memberNameField.getText(), memberId));
                    displayMessage("Member registered successfully!");
                    break;

                case "Borrow Book":
                    if (fieldsAreEmpty(memberIdField, bookTitleField)) {
                        displayMessage("Please enter both member ID and book title.");
                        return;
                    }
                    memberId = Integer.parseInt(memberIdField.getText());
                    displayMessage(library.borrowBook(memberId, bookTitleField.getText()));
                    break;

                case "Return Book":
                    if (fieldsAreEmpty(memberIdField, bookTitleField)) {
                        displayMessage("Please enter both member ID and book title.");
                        return;
                    }
                    memberId = Integer.parseInt(memberIdField.getText());
                    displayMessage(library.returnBook(memberId, bookTitleField.getText()));
                    break;

                case "List All Books":
                    displayArea.setText("All Books:\n" + library.listBooks());
                    break;

                case "List Borrowed Books":
                    // Implement method to show borrowed books
                    break;

                case "List Available Books":
                    // Implement method to show available books
                    break;

                default:
                    displayMessage("Unknown action");
            }
        } catch (NumberFormatException ex) {
            displayMessage("Please enter a valid number for Member ID.");
        }
        clearFields();
    }

    private boolean fieldsAreEmpty(JTextField... fields) {
        for (JTextField field : fields) {
            if (field.getText().trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void displayMessage(String message) {
        displayArea.setText(message);
    }

    private void clearFields() {
        bookTitleField.setText("");
        bookAuthorField.setText("");
        memberNameField.setText("");
        memberIdField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LibraryManagementSystemGUI::new);
    }
}
