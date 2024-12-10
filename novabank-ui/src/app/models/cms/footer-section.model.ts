export class FooterSection{
    id?: number;
    sectionName!: String; // e.g Contact Us, ect
    contentType!:String; // e.g 'text', 'link' ,'icon'
    content!:any; //Flexible data structure for content 
    position!:number; //Order of section
    isActive!:Boolean; //Active Status
}