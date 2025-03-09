package gui;

import javax.swing.JOptionPane;

public class NewJFrame1 extends javax.swing.JFrame {

    String tinhToan = "";
    String toanTu = " ";
    // để nhận biết khi nào bấm dấu =
    boolean ktdaubang = false;

    public NewJFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        nhap = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        number_phantram = new javax.swing.JButton();
        number_pi = new javax.swing.JButton();
        number_mu2 = new javax.swing.JButton();
        number_huy = new javax.swing.JButton();
        number_canbac2 = new javax.swing.JButton();
        number_XmuY = new javax.swing.JButton();
        number1chiax = new javax.swing.JButton();
        number_chia = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number_nhan = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number_tru = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number_cong = new javax.swing.JButton();
        number_xoa = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        number_cham = new javax.swing.JButton();
        number_bang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lichSu = new javax.swing.JTextArea();
        xoaLichSu = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nhap.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhap, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(6, 4, 5, 5));

        number_phantram.setText("%");
        number_phantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_phantramActionPerformed(evt);
            }
        });
        jPanel2.add(number_phantram);

        number_pi.setText("π");
        number_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_piActionPerformed(evt);
            }
        });
        jPanel2.add(number_pi);

        number_mu2.setText("x^2");
        number_mu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_mu2ActionPerformed(evt);
            }
        });
        jPanel2.add(number_mu2);

        number_huy.setBackground(new java.awt.Color(204, 255, 255));
        number_huy.setText("C");
        number_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_huyActionPerformed(evt);
            }
        });
        jPanel2.add(number_huy);

        number_canbac2.setText("√x");
        number_canbac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_canbac2ActionPerformed(evt);
            }
        });
        jPanel2.add(number_canbac2);

        number_XmuY.setText("xʸ");
        number_XmuY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_XmuYActionPerformed(evt);
            }
        });
        jPanel2.add(number_XmuY);

        number1chiax.setText("1/x");
        number1chiax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1chiaxActionPerformed(evt);
            }
        });
        jPanel2.add(number1chiax);

        number_chia.setText("/");
        number_chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_chiaActionPerformed(evt);
            }
        });
        jPanel2.add(number_chia);

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });
        jPanel2.add(number7);

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });
        jPanel2.add(number8);

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });
        jPanel2.add(number9);

        number_nhan.setText("*");
        number_nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_nhanActionPerformed(evt);
            }
        });
        jPanel2.add(number_nhan);

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });
        jPanel2.add(number4);

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });
        jPanel2.add(number5);

        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });
        jPanel2.add(number6);

        number_tru.setText("-");
        number_tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_truActionPerformed(evt);
            }
        });
        jPanel2.add(number_tru);

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(number1);

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel2.add(number2);

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });
        jPanel2.add(number3);

        number_cong.setText("+");
        number_cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_congActionPerformed(evt);
            }
        });
        jPanel2.add(number_cong);

        number_xoa.setText("Backspace");
        number_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_xoaActionPerformed(evt);
            }
        });
        jPanel2.add(number_xoa);

        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });
        jPanel2.add(number0);

        number_cham.setText(".");
        number_cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_chamActionPerformed(evt);
            }
        });
        jPanel2.add(number_cham);

        number_bang.setText("=");
        number_bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_bangActionPerformed(evt);
            }
        });
        jPanel2.add(number_bang);

        lichSu.setColumns(20);
        lichSu.setRows(5);
        jScrollPane2.setViewportView(lichSu);

        xoaLichSu.setText("xóa");
        xoaLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaLichSuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xoaLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(xoaLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhapActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        // TODO add your handling code here:
        // xử lí nhập số khi đã nhập  kết quả 
        if (ktdaubang) {
            ktdaubang = false;
            // xóa trắng kết quả
            nhap.setText("");
        }

        String tmd = evt.getActionCommand();

        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number1ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number2ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number3ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number4ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number5ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number6ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number7ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number8ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number9ActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        // TODO add your handling code here:
        if (ktdaubang) {
            ktdaubang = false;
            nhap.setText("");
        }
        String tmd = evt.getActionCommand();
        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number0ActionPerformed

    private void number_congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_congActionPerformed
        // TODO add your handling code here:
        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_congActionPerformed

    private void number_bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_bangActionPerformed

        if (nhap.getText().equals("") || tinhToan.equals("")) {
            // kiểm tra lỗi nếu nhập bị sai,thiếu
            JOptionPane.showMessageDialog(this, "Lỗi: Chưa nhập đủ dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            // kết thúc không thực hiện phép tính
            return;
        }
        try {
            // chuyển về số thực
            double nhap1 = Double.parseDouble(tinhToan);
            double nhap2 = Double.parseDouble(nhap.getText());
            double ketQua = 0;
            // nếu mà tổng thì cộng 2 giá trị
            if (toanTu.equals("+")) {
                ketQua = nhap1 + nhap2;
            } else if (toanTu.equals("-")) {
                ketQua = nhap1 - nhap2;
            } else if (toanTu.equals("*")) {
                ketQua = nhap1 * nhap2;
            } else if (toanTu.equals("/")) {
                // nếu nhập phần tử thứ 2 thì sẽ hiện thị ra thông báo lỗi vì không chia được
                if (nhap2 == 0) {
                    // hiện thị ra câu thông báo
                    JOptionPane.showMessageDialog(this, "Lỗi: Không thể chia cho 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                ketQua = nhap1 / nhap2;
            } else if (toanTu.equals("xʸ")) {
                ketQua = Math.pow(nhap1, nhap2);

            }
            // in ra kết quả ra màn hình trên textField
            nhap.setText("" + ketQua);
            // lưu lịch sử vào phép tính
            String lichsu = nhap1 + " " + toanTu + " " + nhap2 + "=" + ketQua;
            // thêm vào trong LichSu
            lichSu.append(lichsu + "\n");
            // kiểm tra dấu bằng để khỏ nhập tiếp tục từ bàn phím
            ktdaubang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_number_bangActionPerformed

    private void number_truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_truActionPerformed

        String tmd = evt.getActionCommand();
        
        
        // kiem tra xem nhap co bi rong khong
        if (nhap.getText().isEmpty()) {
            // neu o rong thi nhap dau -
        nhap.setText("-");
        return;
    }
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_truActionPerformed

    private void number_nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_nhanActionPerformed

        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_nhanActionPerformed

    private void number_chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_chiaActionPerformed

        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_chiaActionPerformed

    private void number_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_huyActionPerformed
        // TODO add your handling code here:
        // chuyển tất cả bằng rổng hết
        nhap.setText("");
        tinhToan = "";
        toanTu = "";
        // để xóa trắng toàn bộ
        ktdaubang = false;
    }//GEN-LAST:event_number_huyActionPerformed

    private void number_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_xoaActionPerformed
        // TODO add your handling code here:
        // lấy nội dung hiển thị từ nhập ra
        String text = nhap.getText();
        // kiểm tra xem có bị rỗng hay không
        if (!text.isEmpty()) {
            nhap.setText(text.substring(0, text.length() - 1));// xóa ký tự chỗi cuối cùng       
        }
    }//GEN-LAST:event_number_xoaActionPerformed

    private void number_phantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_phantramActionPerformed
        String tmd = evt.getActionCommand();
        // nếu mà nhâp để không thì không có chuyện gì xảy ra
        if (nhap.getText().equals("")) {
            return;
        }
        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;
            if (tmd.equals("%")) {
                a = a * 100;
            }
            nhap.setText("" + a);
            // lưu lịch sử vào phép tính
            String lichsu = sobandau + "%" + " = " + a;
            // thêm vào trong LichSu
            lichSu.append(lichsu + "\n");
            // kiểm tra dấu bằng để khỏ nhập tiếp tục từ bàn phím
            ktdaubang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_number_phantramActionPerformed

    private void number_canbac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_canbac2ActionPerformed
        if (nhap.getText().equals("")) {
            // kiểm tra nếu rỗng thì return nó 
            return;
        }
        // lấy chuỗi từ nút vừa nhấn
        String tmd = evt.getActionCommand();
        try {

            // chuyển đổi chuỗi sang thực
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;
            // kiểm tra nếu mà nút đấy thì xử lí logic
            if (tmd.equals("√x")) {
                // tính căn bặc 2
                a = Math.sqrt(a);
            }
            // hiển thị kết quả
            nhap.setText("" + a);
            // lưu lịch sử vào phép tính
            String lichsu = "√" + sobandau + " = " + a;
            // thêm vào trong LichSu
            lichSu.append(lichsu + "\n");
            // kiểm tra dấu bằng để khỏ nhập tiếp tục từ bàn phím

            // true để chuyển sang nhập cái khác
            ktdaubang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_number_canbac2ActionPerformed

    private void number_mu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_mu2ActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }
        String tmd = evt.getActionCommand();
        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;
            if (tmd.equals("x^2")) {
                a = a * a;
            }
            nhap.setText("" + a);

            // lưu lịch sử vào phép tính
            String lichsu = sobandau + "^2" + " = " + a;
            // thêm vào trong LichSu
            lichSu.append(lichsu + "\n");
            // kiểm tra dấu bằng để khỏ nhập tiếp tục từ bàn phím

            ktdaubang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_number_mu2ActionPerformed

    private void number_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_piActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }
        String tmd = evt.getActionCommand();
        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;
            if (tmd.equals("π")) {
                a = a * 3.141592653589793;
            }
            nhap.setText("" + a);

            // lưu lịch sử vào phép tính
            String lichsu = sobandau + "π" + " = " + a;
            // thêm vào trong LichSu
            lichSu.append(lichsu + "\n");
            // kiểm tra dấu bằng để khỏ nhập tiếp tục từ bàn phím

            ktdaubang = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_number_piActionPerformed

    private void number1chiaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1chiaxActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }
        String tmd = evt.getActionCommand();
        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;
            if (tmd.equals("1/x")) {
                // nếu a=0 tức là sẽ không chi được 
                if (a == 0) {
                    // đưa ra câu thông báo ở trên màn hình
                    javax.swing.JOptionPane.showMessageDialog(this, "Lỗi: Không thể chia cho 0!", "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                // thực hiện phép tính
                a = 1 / a;
            }
            // in ra kết quả
            nhap.setText("" + a);

            // lưu lịch sử vào phép tính
            String lichsu = "1/" + sobandau + " = " + a;
            // thêm vào trong LichSu
            lichSu.append(lichsu + "\n");

            // kiểm tra dấu bằng để khỏ nhập tiếp tục từ bàn phím       
            ktdaubang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_number1chiaxActionPerformed

    private void number_XmuYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_XmuYActionPerformed

        // lấy nội dung từ các nút
        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_XmuYActionPerformed

    private void number_chamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_chamActionPerformed

        // lấy nội dung từ nhập ra 
        String text = nhap.getText();
        if (text.isEmpty()) {
            nhap.setText("0."); // nếu trong lần nhập bị rỗng thì bắt đầu với số 0 đầu tiên           
        } else if (!text.contains(".")) {
            // thêm vào trong nhập
            nhap.setText(text + ".");

        }
    }//GEN-LAST:event_number_chamActionPerformed

    private void xoaLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaLichSuActionPerformed
        // để  lịch sử thành rỗng
        lichSu.setText("");
    }//GEN-LAST:event_xoaLichSuActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea lichSu;
    private javax.swing.JTextField nhap;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number1chiax;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton number_XmuY;
    private javax.swing.JButton number_bang;
    private javax.swing.JButton number_canbac2;
    private javax.swing.JButton number_cham;
    private javax.swing.JButton number_chia;
    private javax.swing.JButton number_cong;
    private javax.swing.JButton number_huy;
    private javax.swing.JButton number_mu2;
    private javax.swing.JButton number_nhan;
    private javax.swing.JButton number_phantram;
    private javax.swing.JButton number_pi;
    private javax.swing.JButton number_tru;
    private javax.swing.JButton number_xoa;
    private javax.swing.JButton xoaLichSu;
    // End of variables declaration//GEN-END:variables
}
