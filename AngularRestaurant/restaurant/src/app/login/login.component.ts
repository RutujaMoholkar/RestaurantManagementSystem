import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { BackendSeriveService } from '../backend-serive.service';
@Component({
  selector: 'app-login',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {

  loginForm!: FormGroup;

  constructor(
    private backendService: BackendSeriveService,
    private fb: FormBuilder,
    private router: Router
  ) { }
  ngOnInit(): void {
    this.loginForm = this.fb.group({
      email: ['', Validators.required,Validators.email],
      password: ['', Validators.required]
    });
  }

  login(){
    alert("Login Successful!");
  }


}
