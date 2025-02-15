import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleGame extends JFrame {
    private int player1Health = 100;
    private int player2Health = 100;

    private JLabel player1HealthLabel;
    private JLabel player2HealthLabel;
    private JButton player1AttackButton;
    private JButton player2AttackButton;
    private JTextArea gameLog;

    public BattleGame() {
        // Set up the window
        setTitle("Battle Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout and components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        // Player 1 health
        player1HealthLabel = new JLabel("Player 1 Health: " + player1Health);
        panel.add(player1HealthLabel);

        // Player 2 health
        player2HealthLabel = new JLabel("Player 2 Health: " + player2Health);
        panel.add(player2HealthLabel);

        // Game log
        gameLog = new JTextArea();
        gameLog.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(gameLog);
        panel.add(scrollPane);

        // Player 1 attack button
        player1AttackButton = new JButton("Player 1 Attack");
        player1AttackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player2Health -= (int) (Math.random() * 20 + 10); // Random damage between 10 and 30
                updateGame();
                gameLog.append("Player 1 attacks Player 2!\n");
            }
        });
        panel.add(player1AttackButton);

        // Player 2 attack button
        player2AttackButton = new JButton("Player 2 Attack");
        player2AttackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1Health -= (int) (Math.random() * 20 + 10); // Random damage between 10 and 30
                updateGame();
                gameLog.append("Player 2 attacks Player 1!\n");
            }
        });
        panel.add(player2AttackButton);

        // Add panel to the frame
        add(panel);
    }

    private void updateGame() {
        // Update health labels
        player1HealthLabel.setText("Player 1 Health: " + player1Health);
        player2HealthLabel.setText("Player 2 Health: " + player2Health);

        // Check if either player is dead
        if (player1Health <= 0) {
            gameLog.append("Player 1 is defeated!\n");
            player1AttackButton.setEnabled(false);
            player2AttackButton.setEnabled(false);
        } else if (player2Health <= 0) {
            gameLog.append("Player 2 is defeated!\n");
            player1AttackButton.setEnabled(false);
            player2AttackButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BattleGame game = new BattleGame();
                game.setVisible(true);
            }
        });
    }
}
