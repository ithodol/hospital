const onView = async() => {
    const patientid = new URL(location.href).searchParams.get('patientid')
    try{
        const r = await axios.get(`/patient/view?patientid=${patientid}`);
        document.querySelector('.patientid').value = r.data.patientid
        document.querySelector('.name').value = r.data.name
        document.querySelector('.birthdate').value = r.data.birthdate
        document.querySelector('.phone').value = r.data.phone
        document.querySelector('.address').value = r.data.address
        document.querySelector('.createdat').value = r.data.createdat
    }catch(e){console.log(e);}
}
onView();

const onUpdate = async() => {
    const patientid = new URL(location.href).searchParams.get('patientid')
    const name = document.querySelector('.name').value
    const birthdate = document.querySelector('.birthdate').value
    const phone = document.querySelector('.phone').value
    const address = document.querySelector('.address').value

    const obj = {patientid, name, birthdate, phone, address}

    const r = await axios.put('/patient', obj);
    if(r.data == 1){
        alert('환자 정보 수정 완료');
        onView();
    }
}










