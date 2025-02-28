console.log('st');
const onSave = () => {
console.log('st');
    const patientid = document.querySelector('.patientid').value;
    const doctorid = document.querySelector('.doctorid').value;
    const appointmentdate = document.querySelector('.appointmentdate').value;
    const appointmenttime = document.querySelector('.appointmenttime').value;

    const obj = {patientid, doctorid, appointmentdate, appointmenttime};
    axios.post('/appointment', obj)
        .then(r => {
            alert('진료 예약 완료');
            location.href = '/hospital_management/appointment.html';
        })
        .catch(e => {console.log(e);});
}