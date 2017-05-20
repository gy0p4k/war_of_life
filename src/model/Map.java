package model;

import java.util.ArrayList;

/**
 * Created by gy0p4k on 5/21/2017.
 */
public class Map {
  private ArrayList<ArrayList<Cell>> cells;
  private int row;
  private int col;

  public ArrayList<ArrayList<Cell>> getCells() {
    return cells;
  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

  public Map(int row, int col, double probability){
    this.row = row;
    this.col = col;
    cells = new ArrayList<ArrayList<Cell>>();
    ArrayList<Cell> temp;
    for (int i = 0; i < col ; i++) {
      temp = new ArrayList<>();
      for (int j = 0; j < row ; j++) {
        temp.add(new Cell(i, j, Math.random() < probability));
      }
      cells.add(temp);
    }
  }

  public boolean isAlive(int x, int y ){
    return cells.get(y).get(x).isAlive();
  }




}