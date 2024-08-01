import { Component } from '@angular/core';

interface Student{
  id:string;
  name:string;
  fees:number;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  students: Student[] = [
    { id: "16", name: 'Glad', fees: 20000 },
    { id: "63", name: 'Yash', fees: 20000 },
    { id: "14", name: 'Diva', fees: 20000 }
  ];
  student: Student = { id: "", name: '', fees: 0 };
  message: string = '';

  saveStudent() {
    this.students.push({ ...this.student });
    this.message = 'Record ${this.student.id} Saved';
    this.clearStudent();
  }

  upfeesStudent() {
    const index = this.students.findIndex(e => e.id === this.student.id);
    if (index !== -1) {
      this.students[index] = { ...this.student };
      this.message = 'Record ${this.student.id} Upfeesd';
    } else {
      this.message = 'Record ${this.student.id} Not Found';
    }
    this.clearStudent();
  }

  deleteStudent() {
    this.students = this.students.filter(e => e.id !== this.student.id);
    this.message = 'Record ${this.student.id} Deleted';
    this.clearStudent();
  }

  clearStudent() {
    this.student = { id: " ", name: '', fees: 0 };
  }
}
