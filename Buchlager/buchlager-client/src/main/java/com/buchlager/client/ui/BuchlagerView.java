package com.buchlager.client.ui;

import java.awt.CardLayout;

import javax.swing.JFrame;

import com.buchlager.server.model.Buch;




public class BuchlagerView extends JFrame
{
  private static final long serialVersionUID = 3209504767472694065L;

  private JPanelBuchlagerView buchlagerSearchView = null;
  private JPanelBuchdetail buchdetailView = null;
  private JPanelWarenkorb warenkorbView = null;
  private CardLayout cardLayout = null;

  public BuchlagerView()
  {
    super("Buchlager");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.buchlagerSearchView = new JPanelBuchlagerView(this);
    this.buchdetailView = new JPanelBuchdetail(this);
    this.warenkorbView = new JPanelWarenkorb(this);

    this.cardLayout = new CardLayout(20,20);
    this.getContentPane().setLayout(this.cardLayout);
    this.getContentPane().add( this.buchlagerSearchView , "SEARCH" );
    this.getContentPane().add( this.buchdetailView, "DETAIL" );
    this.getContentPane().add( this.warenkorbView, "WARENKORB" );

    this.setResizable(false);
    this.pack();
  }

  public JPanelWarenkorb getWarenkorbPanel()
  {
    return this.warenkorbView;
  }

  public void showDetail()
  {
    Buch buch = this.buchlagerSearchView.getSelectedBuch();
    this.buchdetailView.setBuch(buch);
    this.cardLayout.show(this.getContentPane(), "DETAIL");
  }

  public void showSearch()
  {
    this.cardLayout.show(this.getContentPane(), "SEARCH");
  }

  public void showWarenkorb()
  {
    this.cardLayout.show(this.getContentPane(), "WARENKORB");
  }

}
