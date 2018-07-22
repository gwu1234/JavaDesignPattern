package com.guopingwu;


import java.awt.event.*;

public class CalcController {
//... The Controller needs to interact with both the Model and View.
private CalcModel m_model;
private CalcView  m_view;


CalcController(CalcModel model, CalcView view) {
  m_model = model;
  m_view  = view;
  
  //... Add listeners to the view.
  // this is how controller tell view and model what to do 
  view.addMultiplyListener(new MultiplyListener());
  view.addClearListener(new ClearListener());
}



class MultiplyListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
      String userInput = "";
      try {
          userInput = m_view.getUserInput();
          m_model.multiplyBy(userInput);
          m_view.setTotal(m_model.getValue());
          
      } catch (NumberFormatException nfex) {
          m_view.showError("Bad input: '" + userInput + "'");
      }
  }
}

  
class ClearListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
      m_model.reset();
      m_view.reset();
  }
}
}
