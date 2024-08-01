import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-diva',
  templateUrl: './diva.component.html',
  styleUrl: './diva.component.css'
})
export class DivaComponent {
  sum:number;
  sub:number;

  constructor(private calc:CalculatorService){
    this.sum=calc.getAddtion(10,20);
    this.sub=calc.getSubtraction(20,10);
  }
}
