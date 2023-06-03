<template>

    <v-card outlined>
        <v-card-title>
            CreateReservation
        </v-card-title>

        <v-card-text>
            <String label="TransportationType" v-model="value.transportationType" :editMode="editMode"/>
            <String label="PickUpLocation" v-model="value.pickUpLocation" :editMode="editMode"/>
            <String label="DropOffLocation" v-model="value.dropOffLocation" :editMode="editMode"/>
            <Date label="PickUpDateTime" v-model="value.pickUpDateTime" :editMode="editMode"/>
            <Date label="DropOffDateTime" v-model="value.dropOffDateTime" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createReservation"
            >
                CreateReservation
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateReservationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.transportationType = '';
            this.value.pickUpLocation = '';
            this.value.dropOffLocation = '';
            this.value.pickUpDateTime = '2023-06-03';
            this.value.dropOffDateTime = '2023-06-03';
        },
        watch: {
        },
        methods: {
            createReservation() {
                this.$emit('createReservation', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

