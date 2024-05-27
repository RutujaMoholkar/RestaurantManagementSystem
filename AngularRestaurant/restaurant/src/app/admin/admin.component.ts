import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-admin',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.css'
})
export class AdminComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}




// import { ServiceService } from '../service.service';



// export class AdminComponent {
//   customerCount: number = 0;
//   newPackage: any = {};
//   pakageForm!: FormGroup;
//   registeredMembers: any[] = [];
//   addedPackages: any[] = [];

//   constructor(private adminService: ServiceService, private fb: FormBuilder) {}

//   ngOnInit() {
//     this.pakageForm = this.fb.group({
//       title: [null, [Validators.required]],
//       location: [null, [Validators.required]],
//       days: [null, [Validators.required]],
//       price: [null, [Validators.required]],
//     });
//     this.getCustomerCount();
//     this.getRegisteredMembers();
//     this.getAllVacationPackages();
//   }
//   getRegisteredMembers() {
//     this.adminService.getRegisteredMembers().subscribe((members: any[]) => {
//       this.registeredMembers = members;
//     });
//   }

//   editMember(member: any) {
//     // Here you can implement logic to open a modal or navigate to a different page for editing
//     console.log('Editing member:', member);
//     // For example:
//     // this.router.navigate(['/edit-member', member.id]);
//   }

//   deleteMember(email: string) {
//     // Display a confirmation dialog
//     if (confirm('Are you sure you want to delete this member?')) {
//       // Fetch member details from the database based on email
//       this.adminService.getMemberByEmail(email).subscribe(
//         (member: String) => {
//           // Check if the member exists
//           if (member) {
//             // Call the service method to delete the member
//             this.adminService.deleteMember(email).subscribe(
//               () => {
//                 // Once the deletion is successful, remove the member from the local array
//                 this.registeredMembers = this.registeredMembers.filter(
//                   (member) => member.email !== email
//                 );
//               },
//               (error) => {
//                 // Handle error if deletion fails
//                 console.error('Failed to delete member:', error);
//                 // Optionally, display an error message to the user
//               }
//             );
//           } else {
//             // If member does not exist, display an error message or handle accordingly
//             console.error(
//               'Member with email',
//               email,
//               'not found in the database.'
//             );
//             // Optionally, display an error message to the user
//           }
//         },
//         (error: any) => {
//           // Handle error if fetching member details fails
//           console.error('Failed to fetch member details:', error);
//           // Optionally, display an error message to the user
//         }
//       );
//     }
//   }

//   getCustomerCount() {
//     this.adminService.getCustomerCount().subscribe((count: number) => {
//       this.customerCount = count;
//     });
//   }

//   addPackage() {
//     this.adminService
//       .addPackage(this.pakageForm.value)
//       .subscribe((response) => {
//         // Package added successfully, you can perform additional actions here
//         console.log(response);
//         console.log(alert('Package Added Sucessfully'));
//         window.location.reload();
//       });
//   }

//   getAllVacationPackages() {
//     this.adminService.getAddedPackages().subscribe((packages: any[]) => {
//       this.addedPackages = packages;
//     });
//   }

//   deletePackage(id: any) {

//     if (confirm('Are you sure you want to delete this Package?')) {

//       this.adminService.getPackageById(id).subscribe(
//         (packages: any) => {

//           if (packages) {
   
//             this.adminService.deletePackage(id).subscribe(
//               () => {

//                 this.addedPackages = this.addedPackages.filter(
//                   (packages) => packages.id !== id
//                 );
//               },
//               (error) => {
         
//                 console.error('Failed to delete package:', error);
                
//               }
//             );
//           } else {
       
//             console.error(
//               'Package with id',
//               id,
//               'not found in the database.'
//             );
    
//           }
//         },
//         (error: any) => {

//           console.error('Failed to fetch package details:', error);

//         }
//       );
//     }
//   }
// }