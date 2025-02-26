const onView = async() => {
    const doctorid = new URL(location.href).searchParams.get('doctorid')
    try{
        const r = await axios.get(`/doctor/view?doctorid=${doctorid}`);
        document.querySelector('.doctorid').value = r.data.doctorid
        document.querySelector('.name').value = r.data.name
        document.querySelector('.specialty').value = r.data.specialty
        document.querySelector('.phone').value = r.data.phone
        document.querySelector('.createdat').value = r.data.createdat
    }catch(e){console.log(e);}
}
onView();

const onUpdate = async() => {
    const doctorid = new URL(location.href).searchParams.get('doctorid')
    const name = document.querySelector('.name').value
    const specialty = document.querySelector('.specialty').value
    const phone = document.querySelector('.phone').value

    const obj = {doctorid, name, specialty, phone}

    const r = await axios.put('/doctor', obj);
    if(r.data == 1){
        alert('의사 정보 수정 완료');
        location.href="/hospital_management/doctor.html";
    }
}