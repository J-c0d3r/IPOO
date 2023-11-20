package br.inatel.GymPower.view;

import br.inatel.GymPower.DAO.AulaDAO;
import br.inatel.GymPower.controller.AlunoController;
import br.inatel.GymPower.controller.AulaController;
import br.inatel.GymPower.controller.InstrutorController;
import br.inatel.GymPower.model.Aluno;
import br.inatel.GymPower.model.Aula;
import br.inatel.GymPower.model.Bale;
import br.inatel.GymPower.model.Instrutor;
import br.inatel.GymPower.model.KungFu;
import br.inatel.GymPower.model.Musculacao;
import br.inatel.GymPower.model.Natacao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TlCadastrarProfessorAula extends javax.swing.JPanel {

    AulaController aulaController = new AulaController();
    InstrutorController profController = new InstrutorController();
    AulaDAO aulaDAO = new AulaDAO();

    public TlCadastrarProfessorAula() {
        initComponents();

        Aula aula;

        ArrayList<Aula> listaAulas = aulaController.buscaAulas();
        cmbNomeAula.removeAllItems();
        for (int i = 0; i < listaAulas.size(); i++) {
            cmbNomeAula.addItem(listaAulas.get(i).getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMatProfessor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbNomeAula = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatProfessor2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbNomeAula2 = new javax.swing.JComboBox<>();
        btnRemover = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar Professor na Aula");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nome da Aula");

        txtMatProfessor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Matrícula do Professor");

        cmbNomeAula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOk.setText("Cadastrar");
        btnOk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMatProfessor)
                                    .addComponent(cmbNomeAula, 0, 171, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbNomeAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Remover Professor da Aula");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Nome da Aula");

        txtMatProfessor2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Matrícula do Professor");

        cmbNomeAula2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRemover.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbNomeAula2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtMatProfessor2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatProfessor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbNomeAula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRemover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        Instrutor prof = null;
        Aula aula = null;

        //Pegar matrícula e verificar se é válida
        String matriculaTexto = txtMatProfessor.getText();
        int matricula = profController.verificaMatricula(matriculaTexto);

        if (matricula != -1) {
            //Verificar se aluno existe
            Instrutor aux = new Instrutor();
            aux.setMatricula(matricula);

            prof = profController.busca(aux);
        }

        //Pegar aula selecionada
        String nomeAula = cmbNomeAula.getSelectedItem() + "";

        //Criando objeto da aula
        if (nomeAula.contains("K")) {
            aula = new KungFu();
        } else if (nomeAula.contains("N")) {
            aula = new Natacao();
        } else if (nomeAula.contains("M")) {
            aula = new Musculacao();
        } else if (nomeAula.contains("B")) {
            aula = new Bale();
        }
        if (prof != null && aula != null) {
            aula.setNome(nomeAula);

            Aula aux = aulaDAO.buscarAula(nomeAula);
            if (aux.getInstrutorMatricula() != 0) {
                int op = JOptionPane.showConfirmDialog(null, "Essa aula é ministrada pelo professor " + aux.getInstrutorMatricula() + "\nDeseja alterar o instrutor?\nEssa ação não poderá ser desfeita!");
                if (op == 0) {
                    aulaDAO.removeProfessor(prof.getMatricula(), aula.getNome());
                    aulaController.cadastraProf(prof, aula);
                }
            } else {
                aulaDAO.removeProfessor(prof.getMatricula(), aula.getNome());
                aulaController.cadastraProf(prof, aula);
            }
            txtMatProfessor.setText(null);
            cmbNomeAula.setSelectedIndex(0);
        }


    }//GEN-LAST:event_btnOkActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Instrutor prof = null;

        //Verificar se matrícula é válida
        String matriculaTexto = txtMatProfessor2.getText();
        int matricula = profController.verificaMatricula(matriculaTexto);

        if (matricula != -1) {
            //Verificar se aluno existe
            Instrutor aux = new Instrutor();
            aux.setMatricula(matricula);

            prof = profController.busca(aux);
        }

        //Pegar aula
        String aulaNome = null;
        try {
            aulaNome = cmbNomeAula2.getSelectedItem().toString();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Nunhuma aula selecionada");
        }

        //Verificar se professor está na aula
        if (prof != null && aulaNome != null) {
            boolean ministra = false;

            ArrayList<Aula> lista = aulaController.buscaAulasProf(prof.getMatricula());

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getNome().contains(aulaNome)) {
                    ministra = true;
                    break;
                }
            }

            if (ministra) {
                aulaDAO.removeProfessor(prof.getMatricula(), aulaNome);
                JOptionPane.showMessageDialog(null, prof.getMatricula() + " não é mais professor da turma " + aulaNome);
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, verifique se o professor " + prof.getMatricula() + " ministra aulas para a turma " + aulaNome);
            }
            txtMatProfessor2.setText(null);
            cmbNomeAula2.setSelectedIndex(0);
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Instrutor prof = null;
        cmbNomeAula2.removeAllItems();

        //Pegar matrícula e verificar se é válida
        String matriculaTexto = txtMatProfessor2.getText();
        int matricula = profController.verificaMatricula(matriculaTexto);

        if (matricula != -1) {
            //Verificar se aluno existe
            Instrutor aux = new Instrutor();
            aux.setMatricula(matricula);

            prof = profController.busca(aux);
        }
        if (prof != null) {
            ArrayList<Aula> lista = aulaController.buscaAulasProf(prof.getMatricula());

            for (int i = 0; i < lista.size(); i++) {
                cmbNomeAula2.addItem(lista.get(i).getNome());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbNomeAula;
    private javax.swing.JComboBox<String> cmbNomeAula2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtMatProfessor;
    private javax.swing.JTextField txtMatProfessor2;
    // End of variables declaration//GEN-END:variables
}
